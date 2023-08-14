import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex5Main {
   public static void main(String[] args) {
      try {
         HashMap<Integer, String> definicoes = new HashMap<Integer,String>();
         Path File = Paths.get("numbers.txt");
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromPath(File);
         // create a lexer that feeds off of input CharStream:
         Ex5Lexer lexer = new Ex5Lexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         Ex5Parser parser = new Ex5Parser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();

         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            myListener listener0 = new myListener();
            walker.walk(listener0, tree);

            Scanner sc = new Scanner(System.in);
            definicoes = listener0.getVariables();
            System.out.println(definicoes);
            System.out.print("Write the list of numbers: ");
            String[] numbers = sc.nextLine().split(" ");
            System.out.print("List of numbers: ");
            for (int i = 0; i < numbers.length; i++) {
                String[] numeros_split = numbers[i].split("-");
                for (int j = 0; j < numeros_split.length; j++) {
                    if (definicoes.containsKey(Integer.parseInt(numeros_split[j])))
                        System.out.print(definicoes.get(Integer.parseInt(numeros_split[j])) + " ");
                    else
                        System.out.print(numeros_split[j] + " ");
                }
            }
            System.out.println();
            sc.close();
        }
         }
      catch(

   IOException e)
   {
      e.printStackTrace();
      System.exit(1);
   }catch(
   RecognitionException e)
   {
      e.printStackTrace();
      System.exit(1);
   }
}}
