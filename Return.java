import java.util.Scanner;

public class Return {
    static void main(String[] args) {
        greet();
        int number1 = number();
        int number2 = number();

        int sum = number1 + number2;
        System.out.println("The summation is: "+sum);
    }
    public static int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();
        return num;
    }
    public static void greet(){
        System.out.println("Welcome to the calculator\n");
    }
}
