package come.codezmr.list.methods;

import java.util.ArrayList;
import java.util.List;

public class _01_add {

	public static void main(String[] args) {
		
		/*
		 * It can be used to add the specified element at
		 * the specified index.
		 * 
		 * If any element at the specified index then the provided
		 * new element will be inserted at the specified index and
		 * the existed element will be adjusted to the next index,this
		 * operation is called as 'insert' opration.
		 * 
		 * 
		 * 
		 * */
		
		List<String> list = new ArrayList<String>();
		list.add(0, "AAA");
		list.add(1, "EEE");
		list.add(2, "CCC");
		list.add(3, "BBB");
		list.add(4, "FFF");
		System.out.println(list); //[AAA, EEE, CCC, BBB, FFF]
		
		//list.add(6, "GGG");//Exc-IndexOutOfBoundsException
		
		list.add(2, "ZZZ");
		
		System.out.println(list); //[AAA, EEE, ZZZ, CCC, BBB, FFF]
		
	}

}
