 class Conditionals {
    public static void main(String[] args) {
        //1 2 3 4 5
        int x = 18;
        if (x < 10 ) {
            System.out.println("less than 10");
        }

        else if ( x > 10 & x <20 ) {
            System.out.println("Between 10 and 20");
            System.out.println("In Range");
        }
        else if (x >= 20 ) {
            System.out.println("Greater than or equal to 20");
        }
        else if( x < 10 & x > 20) {
            System.out.println("out of Range");
        }

        //2

    }
}
