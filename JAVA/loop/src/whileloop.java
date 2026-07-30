import java.util.Scanner;

public class whileloop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();// num = 5
        int sum = 0;

        while (num>=0){
            sum = sum+num;
            num--;
        }
        System.out.println(sum);
    }
}
