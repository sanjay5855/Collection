import java.util.ArrayList;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
		//Student s1=new Student();
		ArrayList<Object>al=new ArrayList<>();
		TreeSet<Object> ts=new TreeSet<>();
	//	al.add(5);
	//	al.add("5");
		al.add("a");
		al.add("b");
	//	al.add(6);
		//al.add('a');
	//	al.add(20.6);
		al.add("e");
		al.add("c");
		al.add("k");
		al.add("a");
		System.out.println(al);
		ts.addAll(al);
		
		System.out.println(ts);
		

}
}

