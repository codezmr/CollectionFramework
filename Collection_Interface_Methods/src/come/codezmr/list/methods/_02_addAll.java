package come.codezmr.list.methods;

import java.util.ArrayList;
import java.util.List;

public class _02_addAll {
	
	// addAll(int index, Collection c)
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add(0, "AAA");
		list1.add(1, "BBB");
		list1.add(2, "CCC");
		list1.add(3, "DDD");
		list1.add(4, "EEE");
		System.out.println(list1);//[AAA, BBB, CCC, DDD, EEE]
		
		List<String> list2 = new ArrayList<String>();
		list2.add("XXX");
		list2.add("YYY");
		list2.add("ZZZ");
		System.out.println(list2);//[XXX, YYY, ZZZ]
		
		list1.addAll(2,list2);
		System.out.println(list1); //[AAA, BBB, XXX, YYY, ZZZ, CCC, DDD, EEE]
	}

}
