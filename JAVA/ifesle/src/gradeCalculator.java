import java.util.Scanner;

public class gradeCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

x

        System.out.println("enter your marks : ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <=100){
            System.out.println("A+");
        } else if (marks >= 75 && marks <=89) {
            System.out.println("B+");
        } else if (marks >= 50 && marks <=74) {
            System.out.println("C+");
        }
        else {
            System.out.println("upgrade");
        }
    }

}


//Grade Calculator
//
//Question:
//Marks ke according grade print karo:
//
//90+ → A
//75-89 → B
//50-74 → C
//Below 50 → Fail