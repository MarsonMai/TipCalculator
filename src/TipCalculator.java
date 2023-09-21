import java.util.Scanner;



public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number4 = 0;
        double number5 = 0;
        System.out.print("Welcome to the tip calculator! ");
        System.out.print("How many people are in the group: ");
        int number1 = scan.nextInt();
        System.out.print("Whats the tip percentage? (0-100): ");
        int number2 = scan.nextInt();
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        while (number4 != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number4 = scan.nextInt();
            number5 = number5 + number4;

        }

        // code below the while loop runs after the loop ends
        System.out.print("Done!");



    }
}