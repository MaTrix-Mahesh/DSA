import java.util.Scanner;

public class ap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter nth term of  ap : ");
        int n_term = sc.nextInt();

        for (int i = 2; i <= 3*n_term-1 ; i+=3) {
            System.out.print(i+ " ");
        }
    }
}
//ap -- 2,5,8,11,14,17...... n-term
// nth term = a+(n-1)d