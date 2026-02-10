package src.learning;

import java.util.Scanner;

public class DoWhileSumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        do {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        } while (num != 0);

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
