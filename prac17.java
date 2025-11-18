class Prac17 {
int x;
Prac17(int x)
{
	this.x=x;
}
void display()
{
	System.out.println("Prac17 x="+x);
}
}
class sub extends Prac17
{
	int y;
	sub(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Prac17 x="+x);
		System.out.println("prac17 y="+y);
	}
}
class overrideTest
{
	public static void main(String args[])
	{
		sub s1=new sub(100,200);
		s1.display();
	}
}
