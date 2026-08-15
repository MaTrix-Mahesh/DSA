public class selectionSort {
    static void main(String[] args) {
        int[] array ={10,3,7,1,0};
       // int sort = selection(array);
       // System.out.println(sort);
        selection(array);

        for (int ele : array){
            System.out.print(ele+" ");
        }
    }

   public static void selection(int[] arr) {
        int n = arr.length;
       int count = 0;// count the number comparisons
        for (int i = 0; i <n-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int mindex= -1;
            for (int j = i; j <n ; j++) {
                count++;   // comparison count
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
       System.out.println("Number of comparisons = " + count);

    }
}
