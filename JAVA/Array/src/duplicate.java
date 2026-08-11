public class duplicate {
    static void main(String[] args) {
        int [] arr = {5,1,3,4,2,4};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    break;
                    //System.out.println(arr[i]);
                }
            }

            //System.out.println(arr[i]);
        }
    }
}
