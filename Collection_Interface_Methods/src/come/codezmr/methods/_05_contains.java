package come.codezmr.methods;

import java.util.ArrayList;

public class _05_contains {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		
		System.out.println(al);
		System.out.println(al.contains("CCC"));
		System.out.println(al.contains("GGG"));
	}

}
