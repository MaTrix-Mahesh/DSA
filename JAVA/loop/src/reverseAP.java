public class reverseAP {
    static void main(String[] args) {
        //99,95,91,87,----------
        int n = 10;
        for (int i = 99; i >= 103-4*n; i-=4) {
            System.out.print(i + " ");
        }
    }
}
// 99+(n-1)(-4) =99 -4n +4 = 103-4n
