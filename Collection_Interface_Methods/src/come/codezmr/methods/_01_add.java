package come.codezmr.methods;

import java.util.HashSet;

public class _01_add {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("ZMR"));
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("CCC"));
		System.out.println(hs.add("BBB"));
		System.out.println(hs.add("DDD"));

		System.out.println(hs);
		
		System.out.println(hs.add("CCC"));
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("KKK"));
		System.out.println(hs);
		
		/*Output
		  
		    true
			true
			true
			true
			true
			[AAA, CCC, BBB, DDD, ZMR]
			false
			false
			true
			[AAA, CCC, BBB, DDD, KKK, ZMR]
			
			*/
	}

}
