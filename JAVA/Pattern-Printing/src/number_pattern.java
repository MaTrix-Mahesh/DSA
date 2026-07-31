import java.util.Scanner;

public class number_pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = sc.nextInt();
        System.out.print("enter column : ");
        int column = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

/**.
 *
 *  1234
 *  1234
 *  1234
 *  1234
 *
 *
 */
