import java.util.Scanner;
import java.lang.Math;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cost = 0;
        double totalCost = 0;
        System.out.println("|-----------------------------|");
        System.out.println("Welcome to the tip calculator! ");    //welcomes the user
        System.out.print("How many people are in the group: ");  // asks how much people are in the group
        int people = scan.nextInt();
        System.out.print("Whats the tip percentage? (0-100): ");   // tip percentage
        int tip = scan.nextInt();
        System.out.print("How much money does everyone have:  ");  //amount of cash you have
        int money = scan.nextInt();
        while (cost != -1) {    //checks if cost is -1 and stops if it is
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();

            totalCost = totalCost + cost;
        }
        double totalPlusTip = (tip * 0.01) * (totalCost + 1);   // multiples by .01 so tip is a percentage and adds 1 to total cost to cancel out the -1
        double roundedTotalPlusTip = Math.round(totalPlusTip * 100.0) / 100.0; // rounds by math.round
        double billPlusTip = totalCost + 1 + totalPlusTip;
        double roundedBillPlusTip = Math.round(billPlusTip * 100.0) / 100.0;
        double tipPerPerson = (totalPlusTip / people);
        double roundedTipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        double newMoney = (money - billPlusTip);  // checks money after you pay
        // code below the while loop runs after the loop ends
        if (money >= billPlusTip) {
            System.out.println("Total bill before tip: " + (totalCost + 1)); //learned to round from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
            System.out.println("Total percentage: " + tip + "%");
            System.out.println("Total Tip " + roundedTotalPlusTip);
            System.out.println("Total bill with tip: " + roundedBillPlusTip);
            System.out.println("Per person cost before tip: " + (totalCost + 1) / people);
            System.out.println("Tip per person: " + roundedTipPerPerson);
            System.out.println("Total cost per person: " + ((totalCost + 1) + totalPlusTip) / people);
            System.out.println("you will have: " + newMoney + " dollars");
            System.out.println("|-----------------------------|");

        } else {
            newMoney = billPlusTip - money;
            System.out.println("you do not have enough money(Including tip) ");
            System.out.println("you will need: " + newMoney + " dollars");
        }



    }
}
