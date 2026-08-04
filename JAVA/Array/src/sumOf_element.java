import java.util.Scanner;

public class sumOf_element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of element : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("enter a value : ");
            arr[i] = sc.nextInt();
        }

        // sum kr rha hai
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.print(sum+" ");
    }
}
