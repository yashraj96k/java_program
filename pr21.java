import java.util.*;
class  demo implements  Runnable
{
public void run()
{
System.out.println("java");
}
public static void main (String args[])
{
demo d=new demo();
Thread t=new Thread(d);
t.start();
}
}
