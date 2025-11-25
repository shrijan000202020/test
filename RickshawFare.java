import java.util.Scanner;

public class RickshawFare
{
   public static void main(String[] args){
        float distance;
        int minutes;
        int seconds;
        String local;
        String night;
        double total;
        double tfr;
        double fpk = 2.5;
        double dr = 1.24;
        double nr = 1.5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a local? (Yes/No)");
        local = scanner.nextLine();

        System.out.println("Is it night time? (Yes/No)");
        night = scanner.nextLine();

        System.out.println("Enter distance (km):");
        distance = scanner.nextFloat();

        System.out.println("Enter time (minutes):");
        minutes = scanner.nextInt();

        System.out.println("Enter time (seconds):");
        seconds = scanner.nextInt();

        double time = minutes + (seconds / 60.0);
        
            if(night.equalsIgnoreCase("Yes"))
                {
                    tfr =  nr ;
        
                }
            else
                {
                    tfr =dr;
        
                }
    
        total = distance * fpk + time * tfr;

        if (distance >= 20 && local.equalsIgnoreCase("yes")) 
            {
                total = total - (total * 0.10); 
            }

        System.out.println("Total fare is Rs. " + total);
    }
}