public class OperatorBinary2 {
    public static void main(String[] args) {
        int x = 150;
        int[] values = {225, 1555, 32456};
        System.out.println(x);
        System.out.println("before shift binary: "+Integer.toBinaryString(x));
        x = x >> 1;
        // extra 0 before now, number will be lower
        System.out.println("after shift values: " + x);
        System.out.println("after shift binary: "+Integer.toBinaryString(x));
        System.out.println();



        for(int v : values) {
            System.out.println("values: " + v);
            System.out.println("before shift binary: "+Integer.toBinaryString(v));
            v = v >> 1;

            System.out.println("after shift values: " + v);
            System.out.println("after shift binary: " + Integer.toBinaryString(v));
            System.out.println();
        }
    }

}
