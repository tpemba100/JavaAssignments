import java.util.Arrays;

public class ArrayAssignment {
    public static void main(String[] args) {
        //Task 1
        int[] values = new int[2];
        for (int i = 0; i <= values.length; i++ ) {
            values[0]= i+1;
            System.out.println(values[0]);
        }

        //Task 2
        int[] values2 = {13, 5, 7, 68, 2};
        int middle = (values2.length)/2;
        System.out.println("The middle elemnt is " + values2[middle]);

        //Task 3
        String[] strings1 = {"red", "green", "yellow"};

        System.out.println(strings1.length);
        String[] newStrings = strings1.clone();
        System.out.println(Arrays.toString(newStrings));

        //Task 4
        int[] values4 = new int[5];
        for(int i= 0; i < values4.length; i++) {
            values4[i]= (int) (Math.random() * 10);
            System.out.println(values4[i]);
        }
        System.out.println("first index is " + values4[0] + " and last index is " + values4[values4.length - 1]);
        System.out.println(Arrays.toString(values4));

        //Task 5
        int[] values5 = new int[5];
        for (int i = 0; i < values5.length; i++) {
            values4[i] = i;
        }
    }

}
