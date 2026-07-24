import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance : ");
        int Balance = sc.nextInt();

        System.out.print("Enter withdrawal amount : ");
        int withdrawal = sc.nextInt();


        if (withdrawal % 100 != 0) {
            System.out.println("Amount should be multiple of 100");
        }
        else if (Balance >= withdrawal) {
            int total = Balance - withdrawal;
            System.out.print("Money withdraw successful");
            System.out.println("Remaining balance : " + total);
        }
        else {
            System.out.println("Insufficient balance");
        }

        sc.close();
    }
}