class pr12
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("object Language");
		System.out.println("original string="+str);
		
		//Obtaining string length
		System.out.println("length of string ="+str.length());
		
		//Accessing characters in a string
		for(int i=0;i<str.length();i++)
		{
			int p=i+1;
			System.out.println("character at possition="+p +"is"+str.charAt(i));
			}
	//Inserting a string in the middle
		String str1=new String (str.toString());
		int pos = str1.indexOf("language");
		str.insert(pos,"oriented");
		System.out.println("modified string="+str);
		//modifying characters
		str.setCharAt(6,'-');
		System.out.println("String now="+str);
		
		//Appending a string at the end
		str.append("Improres security");
		System.out.println("Appended string="+str);
	}
}
