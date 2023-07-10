// Task 18: Write a java code to reverse a number

package reverseCode;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number!");
        long number = scan.nextLong();

        String numberString = Long.toString(number);

        for (int i = 1; i <= numberString.length(); i++) {
            long reverseNum = 0;
            Long remainder = number % 10;
            number = number / 10;
            reverseNum = (reverseNum * 10) + remainder;
            System.out.print(reverseNum);
        }
    }
}
