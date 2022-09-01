package pratice.one;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		String str ="asasa1232asds1234567890sddda";
		String[] str1=str.split("[a-z]");
		List<String> list = new ArrayList<>();
		for(int i=0;i<str1.length;i++) {
			if(!str1[i].isEmpty()) {
				list.add(str1[i]);
			}
		}
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			if(s.length()==10) {
				System.out.println(s);
			}
		}
			
	}
}
