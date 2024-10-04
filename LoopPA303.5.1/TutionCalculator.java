public class TutionCalculator {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double targetTuition = 20000;
        double increaseRate = 1.07;

        int years = 0;
        double currentTuition = initialTuition;


        while (currentTuition <= targetTuition) {
            currentTuition *=  increaseRate;
            years++;
        }

        System.out.println("Tuition will double in " + years + " years.");
    }
}
