class A2
{
void display()
{
System.out.println("Base class A");
}
}
class B extends A2
{
void derived()
{
System.out.println("derived class B");
}
}
class C extends A2	
{
void output()
{
System.out.println("derived class C");
}
}
class inh
{
public static void main (String args[])
{
B b=new B();
C obj=new C();
b.display();
b.derived();
obj.display();
obj.output();

}
}