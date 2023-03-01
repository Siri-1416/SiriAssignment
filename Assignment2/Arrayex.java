import java.util.*;
public class Arrayex
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("enter array size");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter array values");
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println("Array elements in ascending order");
for (i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("Second highest number in an array is"+a[n-2]);
}
}

