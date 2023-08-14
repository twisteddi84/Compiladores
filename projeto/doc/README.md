# Index

1. Base Language
2. Code Generation
3. Semantic Analysis
4. Error Handling
5. Test Files
6. Contributions

# 1. Base Language

The base language was developed using ANTLR4 (Dimana.g4). The grammar was developed in a way that would allow the creation of dimensions, their conversion, manipulation, and representation.

## Usage of Dimana: Creating and Manipulating Dimensions

The Dimana language provides the power to create custom dimensions and manipulate them according to the needs of the user. Here are some essential points and interesting features:

## 1. Creating Dimensions

Creating dimensions in Dimana involves using the `dimension` keyword followed by the `real` or `integer` data type, the name of the dimension, and a unit in square brackets. For example, consider the following code:

```
dimension real Length [meter,m];
dimension real Time [second,s];
```

In this example, Length and Time are two dimensions created, each having units meter and second respectively.

In grades.da file, NMEC and Grade dimensions are created with nmec and val units respectively:

```
dimension real NMEC [nmec];
dimension real Grade [val];
```
## 2. Importing Dimensions

Importing dimensions in Dimana involves using the `use` keyword followed by the name of the file containing the dimensions to be imported. For example, consider the following code:

```
use "grades.da";
```

In this example, the dimensions defined in grades.da are imported.

## 3. Manipulating Dimensions

In Dimana, dimensions can be manipulated using various operators such as multiplication, and division. For example, consider the Velocity dimension in physics.da:

```
dimension real Velocity = Length/Time;
```

In this example, Velocity is a dimension that is the result of dividing Length by Time, resulting in a dimension with unit meter/second.

## 4. Defining Alternative Units

Dimensions can also have alternative units, and can be created using the `unit` keyword. For example, consider the following code:

```
unit Length [inch,in] = 0.0254*meter;
```

Here, an alternative unit inch for the dimension Length is defined, and it is set to be equivalent to 0.0254 meter.

## 5. If-Else Statements

Dimana supports if-else statements, which are used to control the flow of the program. The `if` keyword is used to start an if-else statement, and the `else` keyword is used to start the else block. For example, consider the following code:

```
Length x;
Length y;

x = 10*meter; 
y = 5*meter; 

if x > y then
    writeln "x is greater than y.";
else
    writeln "x is not greater than y.";
end;
```

In this example, the if-else statement is used to check if x is greater than y, and print the appropriate message to the stdout.

## 5. Interacting with the User

Dimana supports interactive programming with user input and output. The `read` keyword is used to get input from the user, and the `write` and `writeln` keywords are used to print to the stdout:

```
n = integer(read "NMEC: ")*nmec;
name = read "Name: ";
writeln "Velocity: ", v;
```

In these examples, the `read` keyword is used to read user input, which is then converted to the appropriate dimension. The  `keyword` is used to print the value of v to stdout.

In summary, Dimana is a powerful language for dealing with dimensional analysis. It provides a rich set of features and syntax that allow for the creation and manipulation of dimensions, thereby offering a unique way to express and solve problems involving units and dimensions.

# 2. Code Generation

In the code generation phase, the Dimana code is translated into _JAVA_ code as it's a language that we are all familiar with.

This phase was divided in 2 parts:
- The creation of a String Template Group File, Dimana.stg, that contains the templates for the translation of the Dimana code into _JAVA_ code.
- The creation of a visitor that visits the Dimana code and translates it into _JAVA_ code, DimCompiler.java.

After the semanctic analysis has sucessfully finished, the DimCompiler visitor is called and the translation begins. The visitor visits the Dimana code and translates it into _JAVA_ code, using the templates defined in the Dimana.stg file.

After the compiler has gone through all node of the syntax tree, the _JAVA_ code is written to a file outputDimana.java, which can be compiled and executed using the following steps:

```bash
cd examples
```

```bash
./build.sh
```

```bash
./compile.sh <file.da>
```

```bash
./run.sh
```

# 3. Semantic Analysis
The semantic analysis of our project was performed within the SemanticVisitor visitor. This visitor undertakes numerous semantic checks which are essential to conduct prior to the generation of code. The main checks executed include:

- Ensuring a variable isn't initialized more than once.
- Verifying whether the name of a variable has already been used.
- Certifying that only items of the same type as those specified during list creation can be added to said list.
- In the `write` function, it is ensured that the number of characters is an integer.
- In the `write` function, the variable passed must already exist.
- During variable assignment, we confirm that the appropriate type is passed and that the assigned value has the correct magnitude.
- In addition, subtraction, multiplication, and division operations, we verify the types of the variables involved and the resultant type.
- Within the `read` function, it is ensured that a string is passed as input.
- For the `loop` function, we ensure that the variables used in the expression exist and are of valid types.
- In the `if` function, we ensure that integers or real numbers can be passed, or variables of valid types, for evaluation. Furthermore, we check that both variables are of the same type.

# 4. Error Handling
Error Handling is a feature that facilitates the tracking of any semantic errors that arise during the traversal of the code tree. This feature also empowers us to output tailored messages for each distinct type of error.

# 5. Test Files
Test files were employed extensively to scrutinize our code, ranging from semantic analysis to code generation. Many of the conducted tests utilized the files provided by the professor.

# 6. Contributions 

- Diogo Almeida - Semantic Analysis (50%)
- Duarte Cruz - Base Language (25%), Code Generation (25%)
- Gonçalo Ferreira - Semantic Analysis (50%)
- Mariana Perna - Base Language (25%), Code Generation (25%)
- Rafaela Dias - Base Language (25%), Code Generation (25%)
- Tomás Matos - Base Language (25%), Code Generation (25%)