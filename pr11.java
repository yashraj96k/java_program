class pr11
{
	public static void main(String args[])
	{
		String s="big";
		System.out.println("the first String is="+s);
		String h="small";
		System.out.println("second String is="+h);
		//concate();
		String join= s.concat(h);
		System.out.println("the joining string is"+join);
		//length();
		int len=s.length();
		int lens =h.length();
		System.out.println("size of first string="+len);
		System.out.println("size of sencond string="+lens);
		//isEmpty
		boolean empty=s.isEmpty();
		System.out.println("String is Empty="+empty);
		//to upper case();
		System.out.println("UpperCase of first string is="+s.toUpperCase());
		//to LowerCase();
		System.out.println("LowerCase of second string is="+s.toLowerCase());
		
	}
}
