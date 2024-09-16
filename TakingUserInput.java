import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of given two numbers is: " +sum);
    }
}