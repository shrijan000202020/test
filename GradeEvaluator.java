import java.util.Scanner;

public class GradeEvaluator{
    public static void main(String[] args){
        int marks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks");
        marks = scanner.nextInt();
        if(marks >=40){
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
