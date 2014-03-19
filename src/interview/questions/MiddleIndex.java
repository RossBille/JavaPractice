package interview.questions;

/**
 *
 * @author rossbille
 */
public class MiddleIndex
{
	public static void main(String[] args){
		System.out.println(findMiddleIndex(new int[]{1,0,2,1,909,3,909,0,1}));
	}

	/**
	 *
	 * @param ints
	 * @return the index where the sum of the elements to the right
	 *		   is equal to the sum of the elements to the left (exlusive)
	 *		   if no such index exists -1 will be returned
	 */
	public static int findMiddleIndex(int[] ints){
		int sumLeft = 0;
		int sumRight = 0;
		int startIndex = 0;
		int endIndex = ints.length-1;
		for(int i=0;i<ints.length;i++){
			if(sumLeft<sumRight){
				sumLeft += ints[startIndex++];
			}else{
				sumRight += ints[endIndex--];
			}
			if(startIndex==endIndex){
				if(sumLeft==sumRight){
					return endIndex;
				}else{
					break;
				}
			}
		}		
		return -1;
	}
}
