# Tema **DimAna**, grupo **dimana-06**
--------------------------------------------
## Introduction

This README.md document is the report from the dimana-06 group for the Compilers course in the 2022/2023 academic year.

The assigned project itent was to develop, create, and implement a programming language that would allow the creation and manipulation of dimensions.

A language was developed using _ANTLR4_, which helped us reach our goal. The target language that we selected was _JAVA_.

To implement the expected objectives several tools were used, such as ANTLR4 for the construction of the syntax tree, _StringTemplate_ and _JAVA_ for the generation of code in the target language and also _JAVA_ for the semantic analysis and compiling of the code. The primary development environment used was Visual Studio Code.

## Conception and Design of the Language

The language we've created aims at facilitating the creation and manipulation of dimensions. To this end, we've developed a variety of functions that enable the creation of dimensions, their conversion, manipulation, and representation.

The primary vision behind Dimana's design was to provide a practical and intuitive approach for implementing and handling dimensional analyses in programming. To achieve this, we established a few fundamental principles:

  1. Ease of Use: The language is designed to be accessible even for programmers without any prior knowledge of dimensional analysis.

  2. Flexibility: The language was developed to be sufficiently flexible, in order to permit the definition of any required dimension and to perform any permitted arithmetic operations within those dimensions.

  3. Dimensional Coherence: Ensuring all operations respect the same. For instance, it should not be allowed to add a distance to a speed.

To materialize these principles, we developed functions that allow defining new dimensions, both independently or based on existing dimensions. These dimensions function as new numerical data types, and the definition of a dimension involves the specification of its base unit and, optionally, a suffix.

The language also allows for the conversion between different units of the same dimension and offers mechanisms for the manipulation of these dimensions, such as through arithmetic operations.

## Repository Organization

- **src** - all source code.

- **doc** -- documentation for the project.

- **examples** -- examples of programs written in Dimana.

## Group Members

| NMec | Nome | email | Participação |
|:---:|:---|:---|:---:|
| 108902 | DIOGO FILIPE ROSÁRIO DE ALMEIDA | almeidadiogo03@ua.pt | 16.6% |
| 107359 | DUARTE CARVALHO DA CRUZ | duarteccruz@ua.pt | 16.6% |
| 107853 | GONÇALO MARQUES FERREIRA | goncalomf@ua.pt | 16.6% |
| 108067 | MARIANA FIGUEIREDO PERNA | marianaperna@ua.pt | 16.6% |
| 108782 | RAFAELA ESPÍRITO SANTO DIAS | rafaelaesdias@ua.pt | 16.6% |
| 108624 | TOMAS JOSE CARDOSO MATOS | tomas.matos@ua.pt | 16.6% |