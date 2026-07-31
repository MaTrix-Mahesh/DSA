import java.util.Scanner;

public class sumDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int i = sc.nextInt();

        int sum = 0 ;
        while (i !=0){
            int digit= i%10;
            sum = sum+digit;
            i = i/10;
        }
        System.out.print(sum);
    }
}
// input 12345