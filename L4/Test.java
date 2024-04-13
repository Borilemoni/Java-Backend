class Test {
    public static void main(String[] stringv) {

        boolean young = true; // true / false

        // primitive data types are stored in the STACK memory

        // arithmetic operators
        int a = 20, b = 3; // shorthand for declaring variables from the same type 
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div_floor = a / b; // implicit type casting
        double div = (double) a / b; 
        int mod = a % b;
        // exponentiation and root operations are included in the Math module
        double squareRoot = Math.sqrt(20);
        double exp = Math.pow(a, b);

        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mult);
        // System.out.println(div_floor);
        // System.out.println(squareRoot);
        // System.out.println(exp);

        // Explicit type casting syntax: (<type>) <variable>

        int number = 100000000;
        short num2 = (short) number; // short uses 2 bytes 2^16 -> 65516. int 2^32 -> 40000000000
        System.out.println(num2);

        char g = 'g'; // -> 103
        long gRepresentation = (long) g;
        System.out.println(gRepresentation);
    }
}
