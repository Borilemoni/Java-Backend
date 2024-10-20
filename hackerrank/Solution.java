// Sample Input

// java 100
// cpp 65
// python 50
// Sample Output

// ================================
// java           100 
// cpp            065 
// python         050 
// ================================

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String text = sc.next();
                int number = sc.nextInt();
                System.out.printf("%-15s%03d\n", text, number);                // System.out.print(text);
                // for (int j = 0; j < 15 - text.length(); j++)
                //     System.out.print(" ");
                
                // // #1 5 -> 005
                // if (number.length() == 1) {
                //     number = "00" + number;
                // } else if (number.length() == 2) { // 99 -> 099, 15 -> 015...
                //     number = "0" + number;
                // }
                // System.out.println(number);
            }
            System.out.println("================================");
    }
}
