public class PrefixPostfix7 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        var sum = ++x + y;
        System.out.println(sum);

        // ++x  add 1 before being called
        // x++  calls first then adds after

    }
}
