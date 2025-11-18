class A
{
void display()
{
System.out.println("Base class A");
}
}
class B extends A
{
void derived()
{
System.out.println("derived class B");
}
}
class inh
{
public static void main (String args[])
{
B obj=new B();
obj.display();
obj.derived();
}
}