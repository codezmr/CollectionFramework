package come.codezmr.methods;

import java.util.ArrayList;

public class _08_toArray {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		System.out.println(al);
		
		Object[] elements = al.toArray();
		for(Object element : elements) {
			System.out.print(element + " ");
		}
		
		/* public Object[] toArray();
		 * It can be used to convert all the elements of the
		 * present Collection to the Object[].
		 * */
	}

}
