package come.codezmr.methods;

import java.util.HashSet;

public class _02_addAll {

	/*
	 * It can be used to add all the elements of the specified 
	 * Collection  to the present Collection Object.
	 * 
	 * If the elements are added successfully to the Collection
	 * object the addAll() method will return True value.
	 * 
	 * If the elements are not added successfully to the Collection
	 * object the addAll() method will return False value.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("AAA");
		hs1.add("BBB");
		hs1.add("CCC");
		hs1.add("DDD");
		System.out.println(hs1);
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("XXX");
		hs2.add("YYY");
		hs2.add("ZZZ");
		System.out.println(hs2);
		
		System.out.println(hs1.addAll(hs2)); //true
		System.out.println(hs1);
		
		System.out.println(hs1.addAll(hs2)); //false
		System.out.println(hs1);
		
		
	}

}
