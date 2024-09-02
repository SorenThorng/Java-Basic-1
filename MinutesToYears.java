 // Problem 3: Convert minutes to years and days
import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long years = minutes / (60 * 24 * 365);
        long remainingDays = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}