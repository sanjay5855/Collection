import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test_01 {

	public static void main(String[] args) {
		
		
		int i,size;
		ArrayList al=new ArrayList();
		
		System.out.println(al.size());
		Scanner sc=new Scanner(System.in);
		System.out.println("input the length of the string");
		size=sc.nextInt();
		String a[]=new String[size];
		for(i=0;i<size;i++) {
		a[i]=sc.next();
			
		}
		System.out.println("Sorted string is:");
		for(i=0;i<size;i++) {
			al.add(a[i]);
		}
		Collections.sort(al);
		
		al.forEach((n) -> System.out.println(n));
		
	}

}
