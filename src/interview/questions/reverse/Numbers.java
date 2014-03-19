package interview.questions.reverse;

/**
 *
 * @author rossbille
 */
public class Numbers
{
	public static long reverse(long number){
		String str = String.valueOf(number);
		String reversed = Strings.reverse(str, str.length(), new StringBuilder());
		return Long.parseLong(reversed);
	}
	public static void main(String[] args){
		System.out.println(reverse(123456789L));
	}
}
