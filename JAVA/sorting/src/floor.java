import java.lang.reflect.Array;

public class floor {
    static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int low = 0;
        int high = arr.length - 1;

        int target = 5;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                index = mid;
                low = mid + 1;

            }
            else {
                index = mid;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Floor = " + arr[index]);
            System.out.println("Index = " + index);
        }
        else {
            System.out.println("Floor does not exist");
        }
    }
}
// floor int the sorted array
