import java.util.*;
public class Average
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
float a,b,c;
System.out.println("Enter a value");
a=s.nextInt();
System.out.println("Enter b value");
b=s.nextInt();
System.out.println("Enter c value");
c=s.nextInt();
float avg=((a+b+c)/3);
System.out.println("Average of 3 numbers is : "+avg);
}
}
