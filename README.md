# String-Calculator using TDD 

 1) In a test-first manner, create a simple class class StringCalculatorwith a method public int Add(string numbers)
 The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0)
 for example:  “” == 0 , “1” == 1 , “1,2” == 3
  Start with the simplest test case of an empty string and move to one & two numbers
 Remember to solve things as simply as possible so that you force yourself towrite tests you did not think about
 Remember to refactor after each passing test

2) Allow the Add method to handle an unknown amount of numbers

3) Allow the Add method to handle new lines between numbers (instead of commas).
      1. the following input is ok: “1\n2,3” == 6
      2. the following is INVALID input so do not expect it : “1,\n” (not need to write atest for it)

4) Support different delimiters: to change a delimiter, the beginning of the string will contain a separate line that looks like this: 
“//[delimiter]\n[numbers…]”
for example
“//;\n1;2” == 3
since the default delimiter is ‘;’ .
Note: All existing scenarios and tests should still be supported

5) Calling Add with a negative number will throw an exception “negatives not allowed” -and the negative that was passed. 
