class student
{
int id;
String name;
student()
{
id=0;
name=null;
}
student(int  a,String b)
{
id =a;
name=b;
}
student(student s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println("student id="+id);
System.out.println("student name="+name);
}
public static void main(String args[])
{
student s1=new student();
s1.display();
student s2=new student(1,"OM");
s2.display();
student s3=new student(s2);
s3.display();
}
}




