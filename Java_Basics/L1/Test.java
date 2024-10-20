class Test {
  public static void main(String[] argv) {
    String name = "Monica"; // String is encoded in unicode (2 bytes has all characters) not like most
    char a = 'a'; // has to be in single quotes again unicode encoded
    int age = 13; // int uses 4 bytes by default. Char - 1, Short - 2, Int - 4, Long - 8
    double ft = 35.1; // double precision floating point number
    float kg = 53.5f; // has to use the 'f' at the end to signalize the this is a float value
    boolean polite = false;

    System.out.println("Name is: " + name);
  }
}
