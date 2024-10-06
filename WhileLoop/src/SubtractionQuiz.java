import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        String output="Hello";
        Scanner input = new Scanner(System.in);


        while(count < NUMBER_OF_QUESTIONS) {
            //1. create 2 random number and put in number
            int number1 = (int) (Math.random()*10);
            int number2 = (int) (Math.random()*10);

            if(number1 < number2) {
                int temp = number1;
                number2 = number1;
                number1 = temp;
            }
            System.out.println("What is " + number1 + " minus " + number2 + "?");

            int answer = input.nextInt();
            if(number1 - number2 == answer) {
                System.out.println("You are Correct");
                correctCount++;
            }
            else {
                System.out.println("You are Wrong. " + number1 + " - " + number2 + " = " + "is not " + answer
                        + ". It is" + (number1 - number2));
            }
            //5. increase count
            count++;
        }
        System.out.println("You got " +correctCount + " correct.");
    }
}
