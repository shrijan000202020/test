
public class MathOperations{
    
    public static void main(String[] args){
        int a =100;
        int b =2;
      System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  
        System.out.println("a - b = " + (a - b));   
        System.out.println("a * b = " + (a * b));   
        System.out.println("a / b = " + (a / b));   
        System.out.println("a % b = " + (a % b));   
   
        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));


        System.out.println("\nAssignment Operators:");
        int x = 5;
        System.out.println("x = " + x);
        x += 3; 
      
        System.out.println("\nTernary Operator:");
        int age = 18;
        String r = (age >= 18) ? "Adult" : "Minor";
        System.out.println(r);
        }
    
}