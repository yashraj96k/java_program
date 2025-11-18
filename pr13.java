import java.util.*;
 class pr13
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size array");
a=sc.nextInt();
System.out.println("Enter the element in array");
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
System.out.println("elements:"+b[i]);
}
}
     }   
