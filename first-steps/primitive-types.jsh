int myValue = 10000;
int myMinIntValue = Integer.MIN_VALUE;
int myMaxIntValue = Integer.MAX_VALUE;

System.out.print("Integer Minimum Value = " + myMinIntValue);
System.out.print("Integer Minimum Value = " + Integer.MIN_VALUE);
System.out.print("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

// overflow
int willThisComplie = Integer.MAX_VALUE + 1;
int willThisComplie = 2147483647 + 1
// because Java does not evaluate the expression, it does not throw an error

// underflow
int willThisComplie = Integer.MIN_VALUE - 1;

// this will throw an error
// int notWorking = 2147483647

// underscor in Java literal
int bigNumber = 2_147_483_647
// but not at the start or end
// comma does not work in Java
// int notWoking = 2,146,483,647