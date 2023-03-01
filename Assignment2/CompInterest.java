import java.lang.Math;
import java.util.*;
public class CompInterest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in); 
double P,T,R,I;
System.out.println("Enter P,T,R values");
P=s.nextInt();
T=s.nextInt();
R=s.nextInt();
I=P*(Math.pow((1+R/100),T))-P;
System.out.println("Compound interest is : "+I);
}
}




