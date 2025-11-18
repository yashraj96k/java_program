 class tryex
{
public static void main(String args[])
{
int a=20,b=0,c;
try
{
c=a/b;
System.out.println("division is="+c);
}
catch(ArithmeticException e)
{
System.out.println("divide by zero");
}
finally
{
c=a+b;
System.out.println("addition id="+c);
}
}
}