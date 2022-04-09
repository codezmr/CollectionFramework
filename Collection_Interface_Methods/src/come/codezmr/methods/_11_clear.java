package come.codezmr.methods;

import java.util.ArrayList;

public class _11_clear {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		System.out.println(al1);
		System.out.println(al1.isEmpty());//false
		al1.clear();
		
		System.out.println(al1);
		System.out.println(al1.isEmpty());//true

	}

}
