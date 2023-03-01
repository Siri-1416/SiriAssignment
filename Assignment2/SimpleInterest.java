import java.util.*;
public class SimpleInterest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in); 
int P,T,R,I;
System.out.println("Enter P,T,R values");
P=s.nextInt();
T=s.nextInt();
R=s.nextInt();
I=((P*T*R)/100);
System.out.println("Simple interest is : "+I);
}
}




