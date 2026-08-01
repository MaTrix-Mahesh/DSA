import java.util.Scanner;

public class max_of_3_num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number ");
        int a = sc.nextInt();
        System.out.print("enter number ");
        int b = sc.nextInt();
        System.out.print("enter number ");
        int c = sc.nextInt();

        int maximum = Math.max(a,Math.max(b,c));
        System.out.println("maximummm"+ maximum);
    }
}
// find the max of 3 number using built in function