import java.util.Scanner;

public class squarenumberUsing_i {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
/*
* 1111
* 2222
* 3333
* 4444
*
* AAAA
* BBBB
* CCCC
* DDDD
*ALPHABET SQUARE -3
*
*
* */