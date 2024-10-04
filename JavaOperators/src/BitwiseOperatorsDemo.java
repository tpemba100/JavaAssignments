public class BitwiseOperatorsDemo {
    public static void main(String[] args)
    {
        int x = 58; //111010
        int y =13; //1101
        System.out.println("x & y : " + (x & y)); //returns 8 = 1000
        System.out.println("x | y : " + (x | y)); //63=111111
        System.out.println("x ^ y : " + (x ^ y)); //55=11011
        System.out.println("~x : " + (~x));  //-59
        System.out.println("x << y : " + (x << y));
        System.out.println("x >> y : " + (x >> y));
    }
}

//AND (&):
//Purpose: Extract specific bits from a number.
//Example: If you want to check if a certain bit is 1 (such as whether a number is even or odd), you can use bitwise AND.
//OR (|):
//Purpose: Set specific bits to 1.
//Example: Useful for enabling certain "flags" in a program (e.g., turning on specific bits in a control register).
//XOR (^):
//Purpose: Toggle or flip bits.
//Example: You can use XOR to swap values without using a temporary variable or to toggle certain bits in a number.
//NOT (~):
//Purpose: Invert all the bits.
//Example: Can be used for creating negative numbers in two's complement or for flipping bit patterns in certain algorithms.
//Left Shift (<<):
//Purpose: Multiply a number by powers of 2.
//Example: x << 1 is equivalent to multiplying x by 2, and x << n is equivalent to multiplying x by 2^n. This is faster than regular multiplication.
//Right Shift (>>):
//Purpose: Divide a number by powers of 2 (for integers).
//Example: x >> 1 divides x by 2, and x >> n divides x by 2^n.