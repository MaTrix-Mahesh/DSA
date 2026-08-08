public class secondLargest {
    static void main(String[] args) {
        int[] arr = {10,20,200,90,100};
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        //max
        for(int i=0;i<arr.length;i++){
            if (arr[i] >max){
                max = arr[i];
            }
        }
        //second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >sMax && arr[i] !=max){
                sMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sMax);
    }


}
