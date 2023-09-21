import java.util.Scanner;
import java.lang.Math;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = 0;
        double totalCost = 0;
        System.out.print("Welcome to the tip calculator! ");
        System.out.print("How many people are in the group: ");
        int people = scan.nextInt();
        System.out.print("Whats the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextInt();
            //System.out.print("Enter the item: ");
            //String items = scan.nextLine();
            totalCost = totalCost + cost;
        }
        double totalPlusTip = (tip * 0.01) * (totalCost + 1);
        double roundedTotalPlusTip = Math.round(totalPlusTip * 100.0) / 100.0;
        double billPlusTip = totalCost + 1 + totalPlusTip;
        double roundedBillPlusTip = Math.round(billPlusTip * 100.0) / 100.0;
        double tipPerPerson = (totalPlusTip / people);
        double roundedTipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        // code below the while loop runs after the loop ends
        System.out.println("Total bill before tip: " + (totalCost + 1)); //learned to round from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total Tip " + roundedTotalPlusTip);
        System.out.println("Total bill with tip: " + roundedBillPlusTip);
        System.out.println("Per person cost before tip: " + (totalCost +1) / people);
        System.out.println("Tip per person: " + roundedTipPerPerson);
        System.out.println("Total cost per person: " + ((totalCost + 1) + totalPlusTip) / people);
        System.out.println("------------------------------------------------");
        //System.out.println("Items ordered: ");
        //System.out.println();


    }
}