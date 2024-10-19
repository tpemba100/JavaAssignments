import java.util.InputMismatchException;
import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args) {

            Scanner grades = new Scanner(System.in);
            System.out.println("enter score");
            int score = grades.nextInt();

            if (score > 100 || score < 0)
            System.out.print("Out of Range ( 0 - 100 )");

            else if (score >= 90.0)
                System.out.print("A");
            else if (score >= 80.0)
                System.out.print("B");
            else if (score >= 70.0)
                System.out.print("C");
            else if (score >= 60.0)
                System.out.print("D");
            else
                System.out.print("F");
        }
    }

