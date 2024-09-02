// Problem 1: Convert miles to kilometers
import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a distance in miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}

