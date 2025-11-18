interface A19
{
void display1();
}
interface B 
{
void display2();
}
class C implements A19,B	
{
public void display1()
{
System.out.println("Interface method A");
}
public void display2()
{
System.out.println("Interface method B");
}
 void display3()
{
System.out.println("class C method");
}
}
class inh
{
public static void main (String args[])
{
C obj=new C();
obj.display1();
obj.display2();
obj.display3();
}
}