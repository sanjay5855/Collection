package coreConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class FrequencyCountElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap=new HashMap<>();
		hashMap.put("A", 16);
		hashMap.put("B",17 );
		hashMap.put("C",16 );
		hashMap.put("D",21 );
		hashMap.put("E", 19);
		hashMap.put("F",20 );
		hashMap.put("G",25 );
		hashMap.put("H", 23);
		hashMap.put("I", 24);
		hashMap.put("J", 20);
		hashMap.put("K",19 );
		hashMap.put("L",30 );
		hashMap.put("M",21 );
		hashMap.put("N", 24);
		hashMap.put("O", 25);
		ArrayList arrayList=new ArrayList();
		arrayList.addAll(hashMap.values());
		Collections.sort(arrayList);

		Iterator iterator=arrayList.iterator();
		HashMap<Integer, Integer> hashMap2=new HashMap<Integer, Integer>();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		
		}
		
		System.out.println("+++++++++++++++++++++++++==");
		Object[] arr=arrayList.toArray();
		for(int j=0;j<arr.length;j++) {
			int count=0;
			System.out.println(arr[j]);
			for(int k=0;k<arr.length;k++) {
				if(arr[j]==arr[k]) {
					count++;
				}
			}
			hashMap2.put((Integer) arr[j], count);
			
		}
		System.out.println("------------------yuerurowoeooppwpqpp-----------");
		ArrayList arrayList2=new ArrayList();
		arrayList2.add(hashMap2);
		Iterator iterator2=arrayList2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
				
		}
	

	}


