import java.util.Scanner;

public class Fibonacci {
  public static void Fibonacci_series(int n  ) {
        int a ,b;
        a=0;
        b=1;

      for (int i = 1; i <=n ; i++) {
          System.out.println(a+" ");
          int c= a+b;
          a=b;
          b=c;
      }
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter your term : ");
       int n = sc.nextInt();

       Fibonacci_series(n);

    }
}
