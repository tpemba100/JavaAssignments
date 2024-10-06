public class ArrayLoop {
    public static void main(String[] args) {
        int[] age = {12, 5, 6,9,3};
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };

        System.out.println(age[0]);
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
