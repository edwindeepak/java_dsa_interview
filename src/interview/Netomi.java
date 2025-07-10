package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Netomi {

	public static void main(String[] args) {

		/*
		 * input: arr[] = [1, 1, 2, 1, 3, 5, 1] Size is "n" Majority Element: Element
		 * occuring more than n/2 times
		 */
		
		int arr[] = {1, 1, 2, 1, 3, 5, 1};
		frequency(arr);
		
		
		
	}
	
	
	public static List<Integer> frequency(int[] list) {
		
		Map<Integer,Integer> frequencymap = new HashMap<>();
		
		for(int x : list) {
			
			if(frequencymap.containsKey(x)) {
				frequencymap.put(x, frequencymap.get(x)+1);
			}
			else {
				frequencymap.put(x, 1);
			}
			
		}
		
		System.out.println(frequencymap);
		List<Integer> returnList = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry : frequencymap.entrySet()) {
			if(entry.getValue()>(list.length/2)) {
				returnList.add(entry.getKey());
			}
		}
		
		System.out.println(returnList);
		
		return returnList;
		
	}

}
