import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			if(i%2==0) {
				System.out.println(i);
				System.out.println("even");
			}else if(i==3){
				itr.remove();

			}else if(i==5) {
				itr.set(50);
			}else if(i==7){
				itr.add(70);
			}
				
		}
		System.out.println("-------------------");

		System.out.println(list);

   
	}
   

}
