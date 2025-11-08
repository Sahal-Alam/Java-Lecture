import java.util.Scanner;

public class LogicalOperators {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Ticket Discount Calculator\n");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you female? (True/False) ");
        boolean isfemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You got 75% discount!");
        }
        else if (isfemale) {
            System.out.println("You got 50% discount!");
        } else if (age > 60 && !isfemale) {
            System.out.println("You got 25% discount!");
        }else {
            System.out.println("Sorry! You got no discount.");
        }
    }
}
