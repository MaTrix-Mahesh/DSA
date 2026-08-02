import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindrome( int n ) {
        int original = n;
        int reverse = 0;
        while (n !=0 ){
                int lastdigit = n%10;
                reverse = reverse *10 +lastdigit;
                n = n/10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number you want to check : ");
        int n = sc.nextInt();

        System.out.println(palindrome(n));

    }

}
//Create a function isPalindrome(int n).
//Input: 121
//Output: true