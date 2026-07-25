import java.util.Scanner;

public class Factorial {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your factorial : ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.print(factorial);
    }

}
//factorial --user = 5
// 5*4*3*2*1
