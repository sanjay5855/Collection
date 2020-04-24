import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
		Integer i	=(Integer)itr.next();
		if(i%2==0) {
			System.out.println(i);
		}else {
		 itr.remove();
		}
			
		}
	}

}
