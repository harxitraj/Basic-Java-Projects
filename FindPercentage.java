import java.util.Scanner;

public class FindPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first subject marks: ");
        float a=sc.nextFloat();
        System.out.println("Enter second subject marks: ");
        float b=sc.nextFloat();
        System.out.println("Enter third subject marks: ");
        float c=sc.nextFloat();
        System.out.println("Enter fourth subject marks: ");
        float d=sc.nextFloat();
        System.out.println("Enter fifth subject marks: ");
        float h=sc.nextFloat();
        float per = (a+b+c+d+h)/500;
        float perc = per*100;
        System.out.println("Your obtainted percentage is "+perc +"%");
    }
}