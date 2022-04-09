package come.codezmr.methods;

import java.util.ArrayList;

public class _03_remove {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("AAA");
		al.add("BBB");
		al.add("FFF");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("BBB");
		al.add("BBB");
		
		System.out.println(al);
		System.out.println(al.remove("BBB"));
		System.out.println(al.remove("FFF"));
		System.out.println(al);
		
		System.out.println(al.remove("BBB"));
		System.out.println(al.remove("CCC"));
		System.out.println(al);
		
		System.out.println(al.remove("BBB"));
		System.out.println(al.remove("CCC"));
		System.out.println(al);
	}

}
