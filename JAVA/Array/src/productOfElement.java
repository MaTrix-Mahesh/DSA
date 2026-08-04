import java.util.Scanner;

public class productOfElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }

        // Product
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        System.out.println("Product = " + product);
    }
}