public class Calculator {
        public static void main(String[] args) {
            Calculation math;
            math = new Mathematics();
            int num = 913;

            int subtractionResult = math.subtract(num);
            int multiplicationResult = math.multiply(num);

            System.out.println(subtractionResult);   // Output: 5
            System.out.println(multiplicationResult); // Output: 27
        }
    }

