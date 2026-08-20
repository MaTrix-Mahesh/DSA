import java.lang.reflect.Array;

public class first_accurance {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7};
        int target = 4;

        int low = 0;
        int high = arr.length-1;

        int index_first = -1;

        while(low<high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                index_first= mid;
                high = mid -1;

                low= mid+1;
            } else if (arr[mid] > target) {
                high = mid-1;
            }
            else {
                low = mid +1;
            }
        }
        System.out.println(index_first      );

    }
}
