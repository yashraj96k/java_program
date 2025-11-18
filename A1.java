class A1
{
void display()
{
System.out.println("Base class A");
}
}
class B extends A1
{
void derived()
{
System.out.println("derived class B");
}
}
class C extends B
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
C obj=new C();
obj.display();
obj.derived();
obj.output();

}
}