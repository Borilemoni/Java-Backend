import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    // Creating an array to store integer values
    int[] numbers = new int[5];

    // Initializing the array with user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 5 integer values:");

    for (int i = 0; i < 5; i++) {
      System.out.print("Value " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }

    scanner.close();

    // Calculating the sum of values in the array
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }

    // Calculating the average
    double average = (double) sum / numbers.length;

    // Printing the array, sum, and average
    System.out.print("Entered values: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }

    System.out.println("\nSum: " + sum);
    System.out.println("Average: " + average);

    multiplyByTwo(numbers);
    System.out.println(numbers[0]); // Modified value
  }

  public static void multiplyByTwo(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;
    }
  }
}
