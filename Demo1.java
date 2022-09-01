package pratice.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		int arr[] = { 10, 13, 15, 4, 9, 78, 96, 50 };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}	
		int num=45;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			
			int result = num-arr[i];
			if(result<0)
			map.put(result*-1, i);
			else
				map.put(result, i);
		}
		
		Set<Integer> set =map.keySet();
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		int a = list.get(0);
		for(int ss:list) {
			//System.out.println(ss);
		}
		System.out.println(arr[map.get(a)]);
		System.out.println("hello");
		
		
	}
}
