public class floor_square_root {
    static void main(String[] args) {
        int n = 20;
        int ans =0;
        for (int i = 1; i <=n ; i++) {
            if (i*i <=n){
                ans = i;
            }
            else {
                break;
            }
        }
        System.out.println(ans);
    }
}
