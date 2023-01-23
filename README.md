Ternary Operator =
Java ternary operator is the only conditional operator that takes three operands.
It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming. 
We can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators. 
Although it follows the same algorithm as of if-else statement, the conditional operator takes less space and helps to write 
the if-else statements in the shortest way possible.
Syntax: variable = Expression1 ? Expression2: Expression3

Example:

num1 = 10;
num2 = 20;

res=(num1>num2) ? (num1+num2):(num1-num2)

Since num1<num2,
the second operation is performed
res = num1-num2 = -10