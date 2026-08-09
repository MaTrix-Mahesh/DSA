public class missinnarrahy {
    static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length+1;
        int total_sum = n*(n+1)/2;

        int arr_sum =0;
        for (int ele: arr){
            arr_sum+= ele;
        }
        int missing = total_sum-arr_sum;
        System.out.println();
    }

}
// missing array -> arr = [1,2,3,5] ===== missing = 4
// n = arr.length + 1;
// total_sum =  n * (n+1)/2
// arr_sum = 0;
// missing = total_sum - arr_sum
