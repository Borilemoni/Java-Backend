import java.util.Random;
import java.util.Scanner;

// constraints: work only with letters azAZ and exclude any empty spaces, etc...

public class CeaserCipher
{
    // teksta koito e vuveden: ASCII 
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();

        // "" + "" + "" -> StringBuilder

        for (char letter : plaintext.toCharArray()) {
            char cipherLetter;
            if (Character.isLetter(letter)) {
                // ex1
                // plaintext: Hello
                // key: 3
                // 72, 101, 108, 108, 111
                // ciphertext: Kloor -> 75,104, 111, 111, 114

                // ex2
                // plaintext: zzz -> 122 122 122
                // key: 4
                // ciphertext: xxx -> 126 126 126
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                // 122 + 4 = 126 outside of bounds (65 - 122)
                // 122 - 97 + 4 = inside of tha range(65, 122)
                // 126 - 97 = 39 % 26 -> 13: THIS COMES FROM -> (letter - base + shift) % 26
                // 13 + base = 110 -> n
                // plaintext: zzzz -> cyphertext: nnnn
                cipherLetter = (char) ((letter - base + shift) % 26 + base);
            } else {
                cipherLetter = letter;
            }

            ciphertext.append(cipherLetter);
        }

        return ciphertext.toString();
    }

    public static void decrypt(String ciphertext) {
        // Ask ourselves questions about the method (process)
        // key space: 27
        String possiblePlaintext;
        for (int key = 1; key <= 27; key++) {
            possiblePlaintext = encrypt(ciphertext, key);
            System.out.println("Possible cipher crack: " + possiblePlaintext);

            // analyze the possible plaintext and if it matches the english alphabet then return it as a string
            // rather than pritning all possible plaintext attacks
            // if (possiblePlaintext.isCloseToEnglish()) {
            //     return possiblePlaintext;
            // }
        }
    }

    public static void main(String arg[])
    {
        // TODO: 
        // "Здравейте, аз съм Виктор." -> magic -> "qoiwtjqwitjqwiotj pqowjtpqw jpqwtj o"
        Random rng = new Random();
        int key = rng.nextInt(27); // shift -> отместване
        System.out.println("Key is: " + key);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the message you wish to encrypt: ");
            String plaintext = scanner.nextLine();
            String ciphertext = encrypt(plaintext, key);

            System.out.println("Plaintext is: " + plaintext);
            System.out.println("Ciphertext is: " + ciphertext);

            decrypt(ciphertext);
        }
    }
}
