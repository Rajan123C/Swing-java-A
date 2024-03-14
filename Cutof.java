import java.util.InputMismatchException;
import java.util.Scanner;

public class Cutof {
    public static void main(String[] args) {
        
        int num1 = 56;
        int num2 = 56;
        int num3 = 56;
        int totalnum = num1+num2+num3;
        System.out.println("Sum Of three "+totalnum);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        try {
            int input = sc.nextInt();
            System.out.println(input + " is an integer");
        } catch (InputMismatchException e) {
            System.out.println("Not an integer");
            sc.next(); 
        }

        System.out.println("Enter Your Distance in Kilometer");
        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println(kilometer + " kilometer is equal to " + miles + " miles.");

        sc.nextLine();

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Hello Mr. " + name + " Nice to meet you again");

        System.out.println("Enter marks of 5 subjects");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;

        double percentage = (double) totalMarks / 5;

        System.out.println("Total Marks: " + totalMarks + " Out of 500");
        System.out.println("Percentage: " + percentage + "%");
        if (percentage < 35) {
            System.err.println("Sorry but you have failed");
        } else {
            System.out.println("Pass");
        }
    }
}
