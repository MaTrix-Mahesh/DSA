import java.util.Scanner;

public class maximum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entera size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //input
        for (int i = 0; i <size ; i++) {
            System.out.print("enter your element : ");
            arr[i] = sc.nextInt();
        }
        // max
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max +" ");
    }

}
