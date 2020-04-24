package coreConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);

		System.out.println(list.size());

		ListIterator<Integer> itr=list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//list.remove(0);
			list.add(40);
			//System.out.println(list.size());

		}
		//System.out.println(list.size());

	}

}
