import java.util.Vector; 
class vector
	{
	public static void main(String args[])
	{
	vector ss=new vector();
	ss.add(12);
	ss.add(13);
	ss.add(14);
	ss.add(15);
	ss.add(16);
	vector ss1=new vector(ss);
	System.out.println("Vector ss element"+ss);
	System.out.println("Vector ss1 element"+ss1);
	System.out.println("size of Vector"+ss.size());
	System.out.println("Remove element"+ss.removeElement(13));
	System.out.println(" remove element Vector"+ss);
	}
	         }
