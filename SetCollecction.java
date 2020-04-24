import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class SetCollecction {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		TreeSet ts=new TreeSet();
		int i;
		HashSet<Object>hs=new HashSet<>();
		System.out.println(hs.size());
		ts.add("abhi");
		ts.add("pranay");
		hs.add(5);
		hs.add(5.3);
		hs.add("raghu");
		hs.add('s');
		hs.add("raghu");
		hs.addAll(ts);
		
		System.out.println(hs);
		Iterator it=hs.iterator();
		for(i=1;i<=hs.size();i++)
		System.out.println(it.next());
		hs.removeAll(hs);
		for(i=1;i<=hs.size();i++)
			System.out.println(it.next());
	}		

}
