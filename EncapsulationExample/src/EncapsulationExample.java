import java.util.Scanner;

public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing();
        Scanner input = new Scanner(System.in);
        float height;
        int weight;
        // input for weight and height
        System.out.print("Enter your height: ");
        height = input.nextFloat();

        System.out.print("Enter your weight: ");
        weight = input.nextInt();

        h1.setHeight(height);
        h1.setWeight(weight);
        h1.setBmi(calculateBmi(h1));
        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height, which results in BMI of "+h1.getBmi());
    }
    public static float calculateBmi(HumanBeing h1){
        return h1.getWeight()/(h1.getHeight()*h1.getHeight());
    }
}
