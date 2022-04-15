package come.codezmr.list.methods;

import java.util.ArrayList;
import java.util.List;

public class _03_set {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add(0, "AAA");
		list.add(1, "EEE");
		list.add(2, "CCC");
		list.add(3, "BBB");
		list.add(4, "FFF");
		System.out.println(list);//[AAA, EEE, CCC, BBB, FFF]
		
		list.set(1, "ZMR");
		System.out.println(list);//[AAA, ZMR, CCC, BBB, FFF]
		
		//set method override the elements or replace the element
		//but add method insert the element and adjust that index element
	
		list.add(3, "ZZZ");
		System.out.println(list);//[AAA, ZMR, CCC, ZZZ, BBB, FFF]
	
		list.set(5, "XXX");
		System.out.println(list);
		
		list.set(9, "YYY");
		System.out.println(list);//IndexOutOfBoundsException
	}

}
