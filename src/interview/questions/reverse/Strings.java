package interview.questions.reverse;

/**
 *
 * @author rossbille
 */
public class Strings
{
	/**
	 * Reverse a Strings without using external or standard classes/functions using recursion
	 * @param str the string to reverse
	 * @param index the current end of the string (starts as str.length())
	 * @param reversed the partial reversed string
	 * @return the reversed string
	 */
	public static String reverse(String str, int index, StringBuilder reversed){
		//base case
		if(index == 1){
			return reversed.append(str.charAt(--index)).toString();
		}
		//recurse	
		return reverse(
				//send through the original string
				str,
				//subtract from the index and pass it through
				--index,
				//add the last character from index of str to reversed string
				(reversed.append(str.charAt(index)))
		);
	}
	public static void main(String[] args){
		String str = "level";  // :)
		System.out.println("The original string is: " +str);
		System.out.println("Reveresed: " + reverse(str,str.length(),new StringBuilder()));
		System.out.println("Reversed back: "+reverse(reverse(str, str.length(), new StringBuilder()), str.length(), new StringBuilder()));
	}
}
