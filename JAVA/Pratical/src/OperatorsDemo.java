// 3. Write a Java program to demonstrate arithmetic, relational,
// logical, assignment and conditional operators.

public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical operators
        System.out.println("\nLogical Operators:");
        System.out.println(a > 5 && b < 10);
        System.out.println(a > 5 || b > 10);
        System.out.println(!(a > b));

        // Assignment operator
        System.out.println("\nAssignment Operator:");
        a += b;
        System.out.println("a after a += b: " + a);

        // Conditional operator
        int largest = (a > b) ? a : b;
        System.out.println("\nLargest number: " + largest);
    }
}