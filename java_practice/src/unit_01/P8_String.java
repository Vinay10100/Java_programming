package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) 
	{
		String s1=new String("75457");
		String reverseStr = "";

		int strLength = s1.length();

		for (int i = (strLength - 1); i >=0; --i) {
			reverseStr = reverseStr + s1.charAt(i);
		}

		if (s1.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(s1 + " is a Palindrome String.");
		}
		else {
			System.out.println(s1 + " is not a Palindrome String.");
		}
	}

	void reverseOfAString(String s) 
	{

		String s1=new String();

		for(int i = s.length()-1; i >= 0; i--){    
			s1 = s1 + s.charAt(i);    
		}         
		System.out.println("Reverse string: " + s1);    
	}
	void stringEqualOrNot(String s1,String s2)
	{	
		if(s1.equals(s2))
			System.out.println(" Strings(s1 and s2) are Equal");
		else
			System.out.println(" Strings(s1 and s2) are Not Equal");

	}
}