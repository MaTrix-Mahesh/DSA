
import  java.util.ArrayList;
public class arrayList {
    static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.remove(2));

        System.out.println(arr.add(40));
        System.out.println(arr);
        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println();
        for (int ele : arr){
            System.out.println(ele+" ");
        }
    }
}
