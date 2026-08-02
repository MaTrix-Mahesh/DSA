import java.util.Scanner;

public class prime{
    public static boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true  ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();

        System.out.print(isPrime(n));
    }
}
//Write a function isPrime(int n) that returns true if the number is prime.