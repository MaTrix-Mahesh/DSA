import java.util.Scanner;

public class area_of_circle {
    static void main(String[] args) {
        // area = pi * r* r
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius : ");

        double r = sc.nextDouble();
        System.out.println("area of circle "+ 3.1413*r*r);

    }
}
// take input from user and print the area of circle


