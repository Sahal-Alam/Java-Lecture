import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Your name is : "+name);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = scanner1.nextInt();
        System.out.println(name + " Your age is : "+age);
    }
}
