public class Operators {
    static void UnaryOperators(){
        System.out.println("************* Unary Operators *************");
        int a = 10;
        System.out.println(++a); // Pre-increment // Output: 11 // Increment a by 1 and then use it //Prefix changes the value before use.
        System.out.println(a); // Output: 11 // a is now 11 after the previous operation

        int b = 10;
        System.out.println(b++); // Post-increment // Output: 10 // Use b and then increment it // Postfix changes the value after use.
        System.out.println(b); // Output: 11 // b is now 11 after the previous operation

        int c = 10;
        System.out.println(--c); // Pre-decrement // Output: 9 // Decrement c by 1 and then use it //Prefix changes the value before use.
        System.out.println(c); // Output: 9 // c is now 9 after the previous operation

        int d = 10;
        System.out.println(d--); // Post-decrement // Output: 10 // Use d and then decrement it // Postfix changes the value after use.
        System.out.println(d); // Output: 9 // d is now 9 after the previous operation

        boolean e = true;
        System.out.println(!e); // Logical NOT // Output: false // Negates the boolean value
        System.out.println(e); // Output: true // e remains unchanged

        // Bitwise NOT
        int f = 2; // Binary representation: 10
        System.out.println(~f); // Output: -3 // Bitwise NOT flips the bits of f (10 becomes 01, which is -3 in two's complement)

    }
    static void arithmeticOperators(){
        System.out.println("************* Arithmetic Operators *************");
        int a = 10;
        int b = 5;
        System.out.println(a + b); // Output: 15 // Addition
        System.out.println(a - b); // Output: 5 // Subtraction
        System.out.println(a * b); // Output: 50 // Multiplication
        System.out.println(a / b); // Output: 2 // Division
        System.out.println(a % b); // Output: 0 // Modulus (remainder)
    }

    static void shiftOperator(){
        System.out.println("************* Shift Operators *************");
        int a = 8; // Binary: 1000

        //a << 3  means:  8 * 2^3 =  8 * 8 =  64
        System.out.println(a << 3); // // Output: 64 // Left shift by 3 (1000 becomes 1000000)

        //a >> 3  means:  8 / 2^3 =  8 / 8 =  1
        System.out.println(a >> 3); // Output: 1 // Right shift by 3 (1000 becomes 1, as it shifts out all bits except the last one)

        // a >>> 2 means: 8 / 2^2 = 8 / 4 = 2
        System.out.println(a >>> 2); // Output: 2 // Unsigned right shift by 2 (1000 becomes 10, filling with zeros on the left) // always positive sign shows

    }

    static void logicalOperators() {
        System.out.println("************* Logical Operators *************");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // Output: false // Logical AND // both must be true
        System.out.println(a || b); // Output: true // Logical OR  // at least one must be true
        System.out.println(!a); // Output: false // Logical NOT  // Negates the boolean value
    }

    static void relationalOperators() {
        System.out.println("************* Relational Operators *************");
        int a = 10;
        int b = 5;

        System.out.println(a == b); // Output: false // Equal to
        System.out.println(a != b); // Output: true // Not equal to
        System.out.println(a > b);  // Output: true // Greater than
        System.out.println(a < b);  // Output: false // Less than
        System.out.println(a >= b); // Output: true // Greater than or equal to
        System.out.println(a <= b); // Output: false // Less than or equal to
    }



    public static void main(String[] args) {
        UnaryOperators();
        arithmeticOperators();
        shiftOperator();
        logicalOperators();
        relationalOperators();
        System.out.println("************* End of Operators Demo *************");
    }
}
