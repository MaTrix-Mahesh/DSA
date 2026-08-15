import java.util.ArrayList;
import java.util.Arrays;

public class common_ele {
    static void main(String[] args) {
        int[] arr1 = {3,4,2,2,4};
        int[] arr2 ={3,2,2,7};

        ArrayList<Integer> result = common(arr1, arr2);
        System.out.println("Common elements: " + result);

    }

     static  ArrayList<Integer> common(int [] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i<arr1.length && j< arr2.length){
           if (arr1[i] ==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
           } else if (arr1[i] < arr2[j]) {
               i++;
           }
           else{
               j++;
           }

        }
        return  ans;
    }
}
