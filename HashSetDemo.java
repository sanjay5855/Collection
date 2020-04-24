import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet hs=new HashSet();
		//LinkedHashSet hs=new LinkedHashSet();
		//ArrayList hs=new ArrayList();
		//LinkedList hs=new LinkedList();
		TreeSet hs=new TreeSet();
		//hs.add(null);
		hs.add("A");
		hs.add("B");
		hs.add("Z");
		hs.add("10");
		hs.add("D");
		hs.add("G");
		hs.add("2");
		//hs.add(null);
		hs.add("A");
		System.out.println(hs.add("F"));
		System.out.println(hs);
	}

}
