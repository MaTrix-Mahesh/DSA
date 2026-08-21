public class floor_square_root_binary {
    static void main(String[] args) {
        int n = 20;
        int low = 1, high = n;
                int ans = 0;
                    while(low<=high) {
                        int mid = low + (high - low) / 2;

                        if (mid <= n / mid) {//
                            ans = mid;
                            low = mid + 1;
                        }
                        else {
                            high = mid - 1;
                }
            }
        System.out.println(n);
    }
}
