// Problem 2: Multiply the digits in an integer
import java.util.Scanner;

public class MultiplyDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        System.out.println("The product of the digits in " + number + " is " + product);
    }
}