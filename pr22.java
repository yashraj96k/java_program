import java.lang.*;
class  even extends Thread
{
public void run()
{
for(int i=2;i<=50;i=i+2)
{
System.out.println("even thread="+i);
}
}
}
class  odd extends Thread
{
public void run()
{
for(int i=1;i<=50;i=i+2)
{
System.out.println("Odd thread="+i);
}
}
}
class evenodd
{
public static void main (String args[])
{
even e=new even();
odd o=new odd();
e.start();
o.start();
}
}
