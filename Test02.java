import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1=0,time2;
		
		ArrayList<Object> al=new ArrayList<>();
		LinkedList<Object> ll=new LinkedList<>();
		Vector<Object> vv=new Vector<>();
		//insert objects in Arraylist
		time1=System.nanoTime();
		al.add("abhi");
		al.add("shivam");
		al.add("bk");
		al.add("cbhi");
		time2=System.nanoTime();
		System.out.println("time in arraylist intry :\t"+(time2-time1));
		//insert obj into linkedlist
		time1=System.nanoTime();
		ll.add("loki");
		ll.add("b");
		ll.add(5);
		ll.add(6);
		time2=System.nanoTime();
		System.out.println("time in linked list intry :\t"+(time2-time1));
		
		//insert obj into vector
		time1=System.nanoTime();
		vv.add("abhi");
		vv.add("d");
		vv.add("cs");
		vv.add("it");
		time2=System.nanoTime();
		System.out.println("time in vector intry :\t"+(time2-time1));
		
		
		
	//	Collections.sort(al);
		System.out.println(al);
		System.out.println(ll);
		System.out.println(vv);
	}

}
