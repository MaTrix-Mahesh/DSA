import java.util.Scanner;

public class compositeNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your num : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n-1; i++) {
            if(n%2 ==0){
                System.out.println(" compsite");
                break;
            }
        }

    }
}
//compsite number -- jise ke 2 sa jada factor hota ha --  eg - 6- 1,2,3,6 compsite num eg - 5- 1,5