public class Exception {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index...");
        }

        System.out.println("Continuous printing...");
    }
}