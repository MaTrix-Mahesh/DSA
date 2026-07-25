import java.util.Scanner;

public class sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your number : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = num; i >= 0  ; i--) {
            sum = sum +i;
        }
        System.out.println(sum);
        
    }
}
// user = 5 