import java.util.Scanner;

public class classtest {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your number : ");
//        int num = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <=num ; i++) {
//            sum = sum+i;
//            System.out.print(sum +" ");
//        }
//    }

    // arr is given

    static void main() {
        int sum =0;
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            System.out.println(sum);
        }
    }
}
