import java.util.Scanner;

public class triangle {
    static void main(String[] args) {

//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("enter your number : ");
//        int num = sc.nextInt();


        for (int i = 1; i <=4 ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
