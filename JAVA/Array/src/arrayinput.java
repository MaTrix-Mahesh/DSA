import java.util.Scanner;

public class arrayinput {

    public static void main(String[] args) {

        Scanner scc = new Scanner(System.in);

        int[] arr = new int[10];

        // Input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter input value : ");
            arr[i] = scc.nextInt();
        }

        // Output
        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(2*arr[i] + " ");
        }
    }
}