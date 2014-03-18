package interview.questions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * You have got a range of numbers between 1 to N, where one of the number is repeated. 
 * You need to write a program to find out the duplicate number.
 * @author rossbille
 */
public class DuplicateNumbers
{
	public static void main (String[] args){
		List<Integer> ints = new LinkedList<>();
		for(int i=1;i<100;i++){
			ints.add(i);
		}
		addDuplicate(ints);
		Collections.shuffle(ints);
		System.out.println("dumplicate: "+findDuplicate(ints));
	}

	/**
	 * searches the ints list for the first set of duplicates and returns the duplicated int
	 * @param ints
	 * @return the duplicate number from the ints list or -1 if not found
	 */
	public static int findDuplicate(List<Integer> ints){
		List<Integer> list = new LinkedList<>();
		for(Integer i : ints){
			if(!list.contains(i)){
				list.add(i);
			}else{
				return i.intValue();
			}
		}
		return -1;
	} 

	/**
	 * selects a random Integer from the ints list and adds a new instance of it
	 * @param ints list to add a duplicate value to
	 */
	public static void addDuplicate(List<Integer> ints ){
		//sort list first
		Collections.sort(ints);
		//get mins and max nubmers from the list
		int min = ints.get(0);
		int max = ints.get(ints.size()-1);
		
		
		Random rand = new  Random();
		//get a random int between 0 and (max-min) then add min again to get the range of min->max
		int add = rand.nextInt(max-min)+min;
		//add to the list
		ints.add(add);
		
		System.out.println("added: "+add);
	}
}
