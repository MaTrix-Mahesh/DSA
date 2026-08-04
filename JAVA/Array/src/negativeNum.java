import java.util.Scanner;

public  class negativeNum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter a value : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0){
            System.out.print(arr[i]+" ");}
        }


    }
}