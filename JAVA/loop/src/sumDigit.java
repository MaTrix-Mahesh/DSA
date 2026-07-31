import java.util.Scanner;

public class sumDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number you wnt to add : ");
        int n = sc.nextInt();

        int sum = 0;
        while (n !=0){
            int lastdigit = n%10;
            sum = sum+lastdigit;
            n = n/10;
        }
        System.out.print(sum);
    }
}
// input 12345