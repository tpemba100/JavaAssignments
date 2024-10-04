public class AutoTypeConversion {
    public static void main(String[] args) {
        int x= 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        // int z = x + y; (1) // Error; cannot convert from double to int because double is the higher type
        double z = x + y;   //double = int + double
        System.out.println("Sum of two numbers: " + z);


        // long r = p - q; // (2) // Error; cannot convert from float to long. float is the higher type
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);
    }
}
