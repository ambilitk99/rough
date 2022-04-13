/* 3. Write a program to illustrate the following String manipulation methods.

1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()
*/





// Create new strings using new

class StrManipulation
{
	public static void main(String[] args)
	{
	//new string using new
		char chs[] ={'w','e','l','c','m','e'};
		String newStr = new String(chs);
		System.out.println("New string from char[] using new string : " +newStr);

		byte asciis[]={65,66,67,68,69,70};
		newStr =new String(asciis);
		System.out.println("New String from byte[] using New string :" +newStr);
		System.out.println(" ");

		String s1="good";
		String s2="Morning";
		//string length
		System.out.println("String length of 'good':"+s1.length());
		System.out.println(" ");

		// to uppercase and lowercase
		System.out.println("--------------string change-----------");
		System.out.println(s1+" to uppercase"+s1.toUpperCase());
		System.out.println(s2+" to lowecase "+ s2.toLowerCase());
		System.out.println(" ");

		//string cocatenation
		System.out.println("-------------------string concatenation-------------");
		System.out.println("Using concat():" + s1.concat(s2));
		System.out.println("using + operator : " + s1 + s2);
		System.out.println(" ");

		



		//character extraction
		System.out.println("----------------character extraction----------------");
		System.out.println("character at 3rd position :"+s1.charAt(3));
		char c[]=new char[5];
		s1.getChars(2,4,c,0);
		System.out.println("characters between 2 and 4 : "+ new String(c));
		System.out.println(" ");


		System.out.println("-------------------character comparison---------- ");
		s1="welcome";
		s2="WELCOME";
		System.out.println(s1+" Equals"+";"+s1.equals(s2));
		System.out.println(s1+"equalIgnorecase "+s2+":"+s1.equalsIgnoreCase(s2));


		System.out.println(s1+"compare to "+s2+":"+s1.compareTo(s1));
		System.out.println(s1+"compareToIgnorecase "+s2+":"+s1.compareToIgnoreCase(s2));

		System.out.println(s1+" starts with w:"+s1.startsWith("w"));
		System.out.println(s1+"ends with x :"+s1.endsWith("x"));

		System.out.println("-----------------------------------------search substring------------------");
		s1="Have a nice day";
		System.out.println("Index of nice in,"+s1.indexOf("nice"));

		System.out.println("last Index of nice in,"+s1.lastIndexOf("nice"));


		System.out.println("----------------------modyfying string------------------------------");
		System.out.println("Substring of " +s1.substring(0,7));
		System.out.println("Substring of " +s1.substring(0));
	
		System.out.println("Replace the string : "+s1.replace("nice"," wonderfull"));


		System.out.println("The trim of string is : "+s1.trim());



	}
}



