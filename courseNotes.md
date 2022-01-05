## first steps

- "main" method is a special method in java. It's the entry point of any java code. java looks for it, starts and uses the program here..
- "public" = access modifier
- "static" =
- "void" - won't return any information
- data types: int, string, double, float.. overflow and underflow issues apply to all..

  - primitive types are the most basic data types. (boolean, byte, char, short, int, long, float, double).. each occupies a diff amount of memory.. int needs 4X the space that a byte does.. by default java considers any number you type an int unless you type a letter at the end of it such as L for long..
    - byte: -128 to 127 is the range.. perhaps if you want a to store a ton of numbers between this range.. can help with performance a bit..
      - occupies 8 bits.. thus a byte has a width of 8..
    - short: -32768 to 32767 is the range..
      - occupies 16 bits.. thus a byte has a width of 16..
    - int: -2147483648 to 2147483647 is the range
      - occupies 32 bits.. thus a byte has a width of 32..
    - long: -9223372036854775808 to 9223372036854775807 is the range
      - you end them with the letter "L".. i.e. 100645875L
      - occupies 64 bits.. thus a byte has a width of 64..

- variable declarations must include type
- Wrapper classes:

  - use for all 8 primitive types
  - Integer -> ways to perform operations on any number.. i.e. what are the min/max #s I can store on an int data type.. if you exceed max it 'overflows' -> tried to put to large a number than the comp has allocated space for -> turns negative.. the reverse happens if putting too small a number, but we call it 'underflow'
  - always use integers unless you have a really good reason not to.

- floating point numbers.. 3.14159.. use the 'double' data type preferably -> when we need more precision in calculations..

  - float is a single precision number.. occupies 32 bits (width of 32) AKA 4 bytes.. range = 1.4e^-45 to 3.1028235e^38
  - double is a double precision number.. occupies 64 bits (width of 64) AKA 8 bytes..range = 4.9e^-324 to 1.7976931348623157e^308... much larger range
  - precision refers to the format and amount of space occupied by the type..
  - double is faster to process than float on many computers.. also java library math functions are written to process and return the double type instead of the float..this is the default floating point number
  - BigDecimal -> use this for calculation and precise numbers. floats and doubles aren't great for this...
  - int will round down when it detects a remainder

- char -> can only store a single character.. maybe for storing last key press or last single digit use.. maybe for storing data in arrays.. occupies 2 bytes of memory -> 16 bits.. width of 16.. it allows you to store unicode characters (international encoding standard for use w/ diff languages and scripts by which each letter/digit/symbol is assigned a unique numeric value that applies accross diff platforms/programs).. in english A-Z -> only 26 letters... other languages have many more characters..65,535 diff types of characters it can represent.. unicode-table.com
  - must use single quotes.. double quotes are assumed to be of type String
- booleans -> true/false, yes/no, 1/0...

- 8 primitive types: byte, short, int, long, float, double, char, boolean.. built into the java language itself.. there's a way to create your own data types "classes" -> you can combine data types i.e. 1 or more ints.. make 'super data type'...

- String -> data type, but not primitive.. it's a class.. easier to use than a regular class... it's a sequence of characters..

  - immutable -> can't change after creating.. rather create a new string.. a new String is instantiated when you reassign a String variable..
  - StringBuffer -> mutable, can be changed..

- operators, operands, and expressions:
  - equal sign = is an assignment operator.. assign variables to a value..
  - plus sign + is a sum operator.. adds the two values..
  -
- if then statement:
  - most basic of al control flow statements.. execute section of code if a particular test/expression evaluates to true -> "conditional logic" -> check a condition and execute specific code if that condition evaluates to true
  -

## tutorials

- keywords and naming conventions:

  - keywords:
    - java keywords -> 57 keywords that have a specific meaning
    - can't use these keywords as variables/classnames/methods..
    - reserved words not to be used for any other purpose
    - boolean, byte, class, float, if...
  - naming conventions:
    - use lower camel case for variable names

- Operator Associativity:

  - expression -> a construct that evaluates to a single value.. constructed from operands and operators.. operators indicate which operations to apply to the operands.. order of evaluation is determined by precedence and associativity.. precedence -> order determined by java -> order of operations..
  - associativity.. a direction of execution of operators.. can be right-to-left or left-to-right.. if operators have the same precedence in an expression, then associativity is used to determine the order in which operators are evaluated..
    - "left associative operators" -> evaluated in order from left to right, for example addition and subtraction -> 16 - 8 + 5 -> the subtraction will be done first..
    - "right associative operators" -> evaluated in order from right to left, for example the assignment operator -> int numTrucks = 5; int numCars = 7; int fleetCount = numTrucks + numCars; -> the expression to the right of the equal sign is done first to know what value to store in the variable on the left of the equal sign..

- declaration and expression statements:
  - statments can be compared to sentences in natural languages.. a statement corms a complete unit of execution..
  - 3 types of statements in Java:
    - declaration statement.. declares something, i.e. a variable -> int finalScore = 50;
    - expression statement.. four groups that can become expression statements
      1. assignment expressions -> groupAge = 5... salary _=2... profitMade +=10... add a semi-colon to the end converts these to expression statements -> groupAge = 5;.. salary _=2;... profitMade +=10;...
      2. increment or decrement operators -> numberStudents++... surveyResults--... add a semi-colon to the end converts these to expression statements -> numberStudents++;... surveyResults--;...
      3. method calls -> System.out.println("Testing");
      4. object creation expression -> Car ownersCar = new Car();
    - control flow statement -> control flow statements break up the flow of execution by employing decision making, looping, and branching, enabling your program to conditionally execute blocks of code... whereas other statements inside your source files are generally executed from top to bottom in the order that they appear...
      - several types: if-then, if-then-else, looping (for, while, do-while), branching (break, continue, return)..

increment and decrement operators:

- we can dictate when the increment/decrement happens either before or after the expression is evaluated
- prefix vs. postfix

JDK, JRE, JVM:

- JDK -> java development kit.. to create java programs.. tools to take code that you write and convert them into a format that a JRE/JVM can execute.. i.e. debuggers for testing, compiler, finding errors in your code..
- JRE -> java runtime environment.. includes the JVM.. used to run your java program.. includes libraries/functionality, java launcher.. JDK comes bundled with this.. any person who wants to run java code has to have the runtime edition installed on their comp..
- JVM -> java virtual machine.. an abstract computing machine.. knows nothing about the java language.. only works w/ compiled java code -> like a physical machine.. virtual machine that runs on your comp.. that's how your code is executed.. JDK takes java code, creates class files -> can be executed by the JVM.. the jdk takes the java code that you type into your editor, creates a .class file -> can be executed via the JRE in the JVM..
  - various manufacturer's of OS's create JVMs for their machine's specs.. That's how java can run on many different devices, each device has a JVM built to it's specs..
- slowness -> c++ funs faster, because goes straight to hardware.. java -> runs on the vm, slower.. getting faster and faster.. JVMs are getting better, hardware is much better/faster

whitespace and indentation:

- java ignores all whitespace around source code
- whitespace is used for human readability purposes
- white space doesn't take up any memory in your final program, because java reads your code, strips out all extra spaces before converting it into an executable program.. does however take up more space in your source file (i.e. the file you open in vscode)
- code conventions in google java style website

codeblocks and indentation:

- codeblock -> code within curly braces.. can be within other code blocks
- indentation -> convey structure.. just for human readability.. conventions in google java style website

scope:

- java can access variables from outer code blocks (which are still executing)
- java cannot access variables inside code blacks which have finished executing
  - java automatically deletes variables once the code block has finished... 'cleanup'
- java cannot access variables inside code blocks which have not started executing

methods:

- can be placed in any order
- methods that do not return values can be referred to as "procedures"
- methods that do return values can be referred to as "functions"
- names should be in lowerCamelCase
- need return data types.. void if no return
- optional parameter list in parentheses..

diffmerge tool:

- visually compare and merge files on any os
