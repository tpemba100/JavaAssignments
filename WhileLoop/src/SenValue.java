import java.util.Scanner;

public class SenValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int value (0 to exit): ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print( "Enter an int value to add (0 to exit): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}

