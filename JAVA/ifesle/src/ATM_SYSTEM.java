import java.util.Scanner;

public class ATM_SYSTEM {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 100000;
        int Daily_Withdrawal = 50000;
        int correct_PIN = 1234;

        System.out.print("enter your withdrawal amount : ");
        int withdrawal = sc.nextInt();

        System.out.print("enter your PIN : ");
        int pin = sc.nextInt();


        if (pin != correct_PIN){
            System.out.println("invalid pin hai ");
        } else if (withdrawal %100 != 0) {
            System.out.println("Withdrawal amount ₹100 ke multiple me hona chahiye");
        } else if (withdrawal > Daily_Withdrawal) {
            System.out.println("Limit exceeded");
        } else if (withdrawal > balance) {
            System.out.println("insufficient balance");
        }else {
            balance = balance - withdrawal;
            System.out.println("Transaction successful");
            System.out.println("Remaining balance: " + balance);
        }
        sc.close();
    }
}

/*
*
* ATM system banao.

Input:

Account balance
Withdrawal amount
PIN

Conditions:

PIN correct hona chahiye
Withdrawal amount ₹100 ke multiple me hona chahiye
Balance sufficient hona chahiye
Daily withdrawal limit ₹50,000 hai

Output:

Transaction successful
Invalid PIN
Insufficient balance
Limit exceeded
* */
