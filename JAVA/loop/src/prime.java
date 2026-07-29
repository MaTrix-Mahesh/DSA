import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        boolean flag = true;

        if (num <= 1) {
            System.out.println("Neither Prime nor Composite");
        } else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Composite Number");
            }
        }

        sc.close();
    }
}