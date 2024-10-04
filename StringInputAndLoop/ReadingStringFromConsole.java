import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {
        //Example 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words seperated by space");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        //Example 2
        Scanner text = new Scanner(System.in);
        System.out.println("Enter a character");
        String s = text.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character enter is " + ch);


    }
}
