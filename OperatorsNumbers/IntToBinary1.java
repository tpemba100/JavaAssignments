public class IntToBinary1 {
    public static void main(String[] args) {
        int x = 2;
        int[] values = {9, 17, 88};

        System.out.println("values: " + x);
        System.out.println("before shift binary: "+Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("after shift binary: "+Integer.toBinaryString(x));


        for(int v : values) {
            System.out.println("values: " + v);
            System.out.println("before shift binary: "+Integer.toBinaryString(v));
            v = v << 1;

            System.out.println("after shift values: " + v);
            System.out.println("after shift binary: " + Integer.toBinaryString(v));
        }
    }

}
