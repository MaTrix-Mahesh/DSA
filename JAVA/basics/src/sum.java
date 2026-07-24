import java.util.Scanner;

public class sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your number a :  ");
        int a = sc.nextInt();

        System.out.print("enter your number b : ");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println("sum of a+b = " +c);
    }
}
