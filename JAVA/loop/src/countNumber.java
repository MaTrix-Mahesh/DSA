import java.util.Scanner;

public class countNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your number you want to count : ");
        int n = sc.nextInt();
        int count = 0;
         while (n !=0){
             n= n/10;
             count++;
         }
        System.out.print("Total digit is : "+count);
    }
}
