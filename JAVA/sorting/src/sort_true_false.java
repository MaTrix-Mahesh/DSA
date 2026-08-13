public class sort_true_false {
    static void main(String[] args) {
        int [] arr = {90,80,100,70,40,30};
        boolean sorted = true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] >= arr[i+1]){
              sorted = false;
              break;
            }
        }
        if (sorted){
            System.out.println("sorted");
        }else {
            System.out.println("not sorted");
        }
    }
}
