public class First {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String operator = args[1];

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            // ...
        }

        // break fallthrough

        // Phone myPhone = new Phone("0881593843");
        // Phone yourPhone = new Phone("0895813821");

        // Phone.phoneType = "mobilePhone";

        // System.out.println(myPhone.phoneType + " " + yourPhone.phoneType);
    }
}

class Phone {
    static String phoneType = "CellPhone";
    String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

// First a = new First(), First b = new First()
// a.number = 15;
// b.number = 30;

// state of a -> number = 15, main()
// state of b -> number = 30, main()
// 
