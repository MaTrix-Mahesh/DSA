public class segregate {
    static void main(String[] args) {
        int [] arr = {0,0,1,0,0,1,0,0,1};
        int number_of_zero =0;
        int number_of_ones = 0;

        for (int ele: arr){
            if (ele==0){
                number_of_zero++;
            }else {
                number_of_ones++;
            }
        }
        System.out.println(number_of_ones+" ");
        System.out.println(number_of_zero+" ");

    }
}
// segregate  -> [0,0,1,0,0,1,0,0,1]