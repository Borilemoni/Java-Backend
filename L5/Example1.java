import java.util.Scanner;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numbers = new int[5]; 
            
        Scanner scanner = new Scanner(System.in);
        // prompt

        for (int i=0; i < 5; i++ )
        {
            System.out.print("Value: " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // sum
        int sum = 0;
        // iterable - последователност
        for (int number : numbers) {
            sum += number;
            // sum = sum + number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average value in the array is: " + average);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        multiplyByTwo(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void multiplyByTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
