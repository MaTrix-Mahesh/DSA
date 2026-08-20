public class maximum_count {
    static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > 0) {
                high = mid - 1;
            } else if (arr[mid] < 0) {

                low = mid + 1;

            }
            else {

                break;
            }
        }
    }
}
