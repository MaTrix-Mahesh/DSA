import java.util.Scanner;

public class multiply_0ddindex {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        //input lo
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("enter a element : ");
            arr[i] = sc.nextInt();
        }
        // condition
        for (int i = 0; i <arr.length ; i++) {
            if ( arr[i] % 2 !=0){
                System.out.println(arr[i] * 2);
            }else {
                System.out.println(arr[i]+10+ " ");
            }

        }
    }
}
