public class binary_sreach {
    static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,49,510,615,9911,99999};
        int left = 0;
        int right = arr.length-1;

        int target = -4;
        while(left<right){
            int mid = (left+right)/2;

            if (arr[mid] == target){
                System.out.println("element is found "+ mid);
                return;
            }
            else if (arr[mid] >target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}
