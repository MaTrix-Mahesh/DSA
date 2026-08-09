public class rotateOfArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        int d = 2;

        d = d % n;
        reverse(arr, 0, d - 1);//(arr[], 0 ,d-1)  starting 10,20 ko reverse kra ga[20,10]
        reverse(arr, d, n - 1);// (arr[] , d, n-1) 30,40,50 reverse kr do - [50,40,30]
        reverse(arr, 0, n - 1);//(arr[],0,n-1)   20,10,50,40,30  reverse - [ 30,40,50,10,20]

        // print
        for (int ele : arr){
            System.out.println(ele+" ");
        }
    }
    public  static void reverse(int[] arr , int i , int j ){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
// [10,20,30,40,50] and d = 2, n = 5
// final - [30,40,50,10,20]

// logic - (arr[], 0 ,d-1)  starting 10,20 ko reverse kra ga[20,10]
//       - (arr[] , d, n-1) 30,40,50 reverse kr do - [50,40,30]
//       - (arr[],0,n-1)   20,10,50,40,30  reverse - [ 30,40,50,10,20]