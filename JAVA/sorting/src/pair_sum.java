import java.util.Arrays;

public class pair_sum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        sum_pair(arr);
    }

    static void sum_pair(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int target = 9;
        Arrays.sort(arr);

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println(arr[start] + " + " + arr[end] + " = " + target);
                break;
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
    }
}

// find a sum of pair of element equal to target element
//Time Complexity = O(n log n)
//
//Space Complexity = O(1)
//two pointers
