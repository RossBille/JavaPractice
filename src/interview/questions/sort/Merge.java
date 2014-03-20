package interview.questions.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rossbille
 * @param <T>
 */
public class Merge<T>
{
	private static <T extends Comparable<T>> List<T> merge(List<T> left, List<T> right){
		List<T> finalList = new LinkedList<>();
		//combine where possible
		while(!right.isEmpty() && !left.isEmpty()){
			//left is less than right
			if(left.get(0).compareTo(right.get(0)) < 0){
				finalList.add(left.remove(0));
			}else{
				finalList.add(right.remove(0));
			}
		}
		//add the remainders to the final result
		finalList.addAll(left);
		finalList.addAll(right);
		return finalList;
	}
	public static <T extends Comparable<T>> List<T> mergeSort(LinkedList<T> list){
		if(list.size()<=1){
			return list;
		}
		//split in 2
		int mid = (list.size())/2;
		List<T> left = new LinkedList<>();
		left.addAll(list.subList(0, mid));
		List<T> right = new LinkedList<>();
		right.addAll(list.subList(mid,list.size()));
		
		//recurse
		left = mergeSort((LinkedList<T>) left);
		right = mergeSort((LinkedList<T>) right);
		
		//merge
		return merge(left, right);
	}
	public static void main(String[] ags){
		List<Integer> list = new LinkedList<>();
		Random random = new Random();
		for(int i=0;i<random.nextInt(1000)+1;i++){
			list.add(random.nextInt(10000));
		}
		System.out.println("pre-sort: "+list);
		System.out.println("post-sort: " + mergeSort((LinkedList<Integer>) list));
	}
}
