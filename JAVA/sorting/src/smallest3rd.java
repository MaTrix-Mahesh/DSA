public class smallest3rd {
    static void main(String[] args) {
        int[] array ={10,3,7,1,0};
        // int sort = selection(array);
        // System.out.println(sort);
        int result = selection(array);
        System.out.println("3rd smallest element = " + result);

    }
    public static int selection(int[] arr) {
        int n = arr.length;
        int k =4 ;

        int count = 0;// count the number comparisons

        for (int i = 0; i <k ; i++) {

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
        return  arr[k-1];

    }
}
/*
arr[] = {7,10,4,3,20,15]
int k = 3


phle sort kro
ouput = 7

3rd smallest element in the given array is 7
/
 */