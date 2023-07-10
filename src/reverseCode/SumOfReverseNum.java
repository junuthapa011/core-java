// Task17: Write a Java code to print the sum of all digits in a number.

package reverseCode;

import java.util.Scanner;

public class SumOfReverseNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scan.nextLong();

        String numberString = Long.toString(number);
        long sum = 0;
        for (int i = 1; i <= numberString.length(); i++) {

            long digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.print(sum);
    }
}
