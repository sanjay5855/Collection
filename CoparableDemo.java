import java.util.TreeSet;

public class CoparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TreeSet t=new TreeSet(new MyComarator());
 t.add(1);
 t.add(10);
 t.add(0);
 t.add(5);
 t.add(10);
 System.out.println(t);
 
	}

}
