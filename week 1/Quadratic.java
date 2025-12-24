import java.util.Scanner;
public class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter coeff of a");
        double a=sc.nextDouble();
        System.out.println("enter coeff of b");
        double b=sc.nextDouble();
        System.out.println("enter coeff of c");
        double c=sc.nextDouble();
        double d=b*b-4*a*c;
        if (d>0)
        {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("roots are real and distant");
            System.out.println("root 1="+r1);
            System.out.println("root 2="+r2);
            
        }
        else if(d==0)
        {
            double r1=-b/(2*a);
            System.out.println("roots are real and equal");
            System.out.println("both roots="+r1);
        }
        else 
        {
            double r1=-b/(2*a);
            double r2=Math.sqrt(-d)/(2*a);
            System.out.println("roots are complex");
            System.out.println("root 1="+r1+"+"+r2+"i");
            System.out.println("root 2="+r1+"-"+r2+"i");
        }
    } 
}