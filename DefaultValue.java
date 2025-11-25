
public class DefaultValue
{
     int i ;
        byte b;
        char c;
        long l ;
        double d;
        short s;
        boolean bo;
        float f;
    
    public static void main (String[] args) {
            DefaultValue data = new DefaultValue();
        System.out.println("integer = "+ data.i +"\n byte =" +data.b +"\n char =" +data.c +"\n long ="
        +data.l +"\n double =" +data.d +"\n short =" +data.s +"\n boolean =" +data.bo +"\n float =" +data.f);
    }
//the reason for using instance variable is due to local variable are not assigned default values and shows error when u dont initialize the variables// 
}