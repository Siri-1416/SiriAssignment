import java.util.*;
public class Maxno
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a,b,c values");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b)
{
if(a>c)
System.out.println("a is maximum");
else
System.out.println("c is maximum");
}
else
{
if(b>c)
System.out.println("b is maximum");
else
System.out.println("c is maximum");
}
}
}
