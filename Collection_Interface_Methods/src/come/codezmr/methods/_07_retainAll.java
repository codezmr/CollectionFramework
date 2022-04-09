package come.codezmr.methods;

import java.util.ArrayList;

public class _07_retainAll {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		al1.add("EEE");
		System.out.println(al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("BBB");
		al2.add("CCC");
		System.out.println(al2);
		System.out.println(al1.retainAll(al2));
		System.out.println(al1);

	}

}
