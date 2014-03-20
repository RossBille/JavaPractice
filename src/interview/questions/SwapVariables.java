package interview.questions;

/**
 * how to swap the values of 2 variables without using a temp variable
 * @author rossbille
 */
public class SwapVariables
{
	public static void main(String[] args){
		swap(1,2);
		swap(-1,24);
		swap(-21,200);
		swap(12,-9);
		swap(3,2);
	}
	public static void swap(int a, int b){
		System.out.println("Inital...");
		System.out.printf("a:%d, b:%d\n",a,b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("a:%d, b:%d\n",a,b);
	}
	
}
