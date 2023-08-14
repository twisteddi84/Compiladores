import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DimanaMain {
   public static void main(String[] args) {
      try {
         CharStream input = CharStreams.fromStream(System.in);
         String file_input = input.toString();
         Pattern pattern = Pattern.compile("use [\"']([^\"']+)[\"'];");

         Matcher matcher = pattern.matcher(file_input);
         StringBuffer output = new StringBuffer();
         while (matcher.find()) {
            String fileName = matcher.group(1);
            try {
               String fileContent = new String(Files.readAllBytes(Paths.get("../examples/" + fileName)),
                     StandardCharsets.UTF_8);
               matcher.appendReplacement(output, ""); // Clear the buffer without appending to output
               output.insert(0, fileContent); // Prepend fileContent to the start of output
               output.insert(fileContent.length(), "\n"); // Add a newline after each appended fileContent
            } catch (IOException e) {
               System.out.println("Error reading use file: " + fileName);
            }
         }
         matcher.appendTail(output);

         CharStream input_antlr = CharStreams.fromString(output.toString());
         // create a lexer that feeds off of input CharStream:
         DimanaLexer lexer = new DimanaLexer(input_antlr);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         DimanaParser parser = new DimanaParser(tokens);
         // replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));

            SemanticVisitor sm = new SemanticVisitor();
            sm.visit(tree);
            if (ErrorHandling.error()) {
               System.out.println("Erro semantico!");
               System.exit(1);
            }

            System.out.println("Compilando...");
            DimCompiler compiler = new DimCompiler();
            ST result = compiler.visit(tree);
            result.add("name", "Dimana");

            File outputDir = new File("outputDimana.java");
            FileWriter fw = new FileWriter(outputDir);
            fw.write(result.render());
            fw.close();
            System.out.println("Compilado com sucesso!");
         }
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}