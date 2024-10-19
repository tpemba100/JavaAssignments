import java.util.Scanner;

public class TaxBracket {

    public static double calculateTax(String filingStatus, double income) {
        double tax = 0.0;
        double[][] brackets;

        switch (filingStatus.toLowerCase()) {
            case "single":
                brackets = new double[][]{
                        {8350, 0.10}, {33950, 0.15}, {82250, 0.25}, {171550, 0.28}, {372950, 0.33}, {Double.POSITIVE_INFINITY, 0.35}
                };
                break;
            case "married_filing_jointly":
                brackets = new double[][]{
                        {16700, 0.10}, {67900, 0.15}, {137050, 0.25}, {208850, 0.28}, {372950, 0.33}, {Double.POSITIVE_INFINITY, 0.35}
                };
                break;
            case "married_filing_separately":
                brackets = new double[][]{
                        {8350, 0.10}, {33950, 0.15}, {68525, 0.25}, {104425, 0.28}, {186475, 0.33}, {Double.POSITIVE_INFINITY, 0.35}
                };
                break;
            case "head_of_household":
                brackets = new double[][]{
                        {11950, 0.10}, {45500, 0.15}, {117450, 0.25}, {190200, 0.28}, {372950, 0.33}, {Double.POSITIVE_INFINITY, 0.35}
                };
                break;
            default:
                return -1;
        }

        double previousLimit = 0;
        for (double[] bracket : brackets) {
            double limit = bracket[0];
            double rate = bracket[1];
            if (income > limit) {
                tax += (limit - previousLimit) * rate;
                previousLimit = limit;
            } else {
                tax += (income - previousLimit) * rate;
                break;
            }
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your filing status: ");
        String filingStatus = scanner.nextLine();

        System.out.println("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(filingStatus, income);
        System.out.printf("The tax you owe is: $%.2f%n", tax);

        scanner.close();
    }
}
