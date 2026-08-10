import java.util.Arrays;

public class wave {
    static void main(String[] args) {
        int [] arr =  {10,20,30,40,50};
        for (int i = 0; i <arr.length; i+=2) {
            if ( i == arr.length-1) break;
            int temp = arr[i];
                arr[i] =arr[i+1];
                arr[i+1] =temp ;

        }
        System.out.println(Arrays.toString(arr));
    }
}
// input {10,20,30,40,50}
//output {20,10,40,30,50}
