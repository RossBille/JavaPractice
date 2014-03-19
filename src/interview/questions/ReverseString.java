package interview.questions;

/**
 *
 * @author rossbille
 */
public class ReverseString
{
	/**
	 * Reverse a String without using external or standard classes/functions using recursion
	 * @param str the string to reverse
	 * @param index the current end of the string (starts as str.length())
	 * @param reversed the partial reversed string
	 * @return the reversed string
	 */
	public static String reverse(String str, int index, String reversed){
		//base case
		if(index == 1){
			return reversed + str.charAt(--index);
		}
		//recurse	
		return reverse(
				//send through the original string
				str,
				//subtract from the index and pass it through
				--index,
				//add the last character from index of str to reversed string
				(reversed+str.charAt(index))
		);
	}
	public static void main(String[] args){
		String str = "level";  // :)
		System.out.println("The original string is: " +str);
		System.out.println("Reveresed: " + reverse(str,str.length(),""));
		System.out.println("Reversed back: "+reverse(reverse(str, str.length(), ""), str.length(), ""));
	}
}
