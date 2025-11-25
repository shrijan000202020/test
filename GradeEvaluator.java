import java.util.Scanner;

public class GradeEvaluator{
    public static void main(String[] args){
        int marks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks");
        marks = scanner.nextInt();
        if(marks >=40)
        {
            if(marks >=90)
            {
                System.out.println("A+");
            }
            else if(marks>=80)
        {
            System.out.println("A");
        }
        else if(marks>=70)
        {
            System.out.println("B+");
        }
        else if(marks>=60)
        {
            System.out.println("B");
        }
        else if(marks>=50)
        {
            System.out.println("C+");
        }
        else
            {
                System.out.println("C");
            }
        }    
        else if(marks>100)
        {
            System.out.println("invalid");
        }
        else
            {
                System.out.println("fail");
            }
        }
 }
