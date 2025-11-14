import java.util.Scanner;

public class WhileLoop {
    static void main(String[] args) {
        int num = 1;
        while (num <= 5){
            System.out.println("Your number is: "+num);
            num = num + 1;
        }
        int num1 = 500;
        while (num1 > 200){
            System.out.println(+num1);
            num1 -= 1;
        }
        Scanner input = new Scanner(System.in);
        int num2 = 0;
        while (num2 < 5){
            System.out.print("Input your number: ");
            int number = input.nextInt();
            System.out.print("Your input number is: "+number+"\n");
            num2++;
        }
    }
}
