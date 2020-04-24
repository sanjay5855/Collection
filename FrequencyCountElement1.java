package coreConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FrequencyCountElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 16);
		hashMap.put("B", 17);
		hashMap.put("C", 16);
		hashMap.put("D", 21);
		hashMap.put("E", 19);
		hashMap.put("F", 20);
		hashMap.put("G", 25);
		hashMap.put("H", 23);
		hashMap.put("I", 24);
		hashMap.put("J", 20);
		hashMap.put("K", 19);
		hashMap.put("L", 30);
		hashMap.put("M", 21);
		hashMap.put("N", 24);
		hashMap.put("O", 25);
		ArrayList arrayList = new ArrayList();
		arrayList.addAll(hashMap.values());
		Collections.sort(arrayList);

		Iterator iterator = arrayList.iterator();
		HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("--------------------------");
		Set set = new HashSet();
		set.addAll(arrayList);
		Iterator iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());

		}
		System.out.println("=================================");
        HashMap hashMap3=new HashMap();
       //System.out.println("99999999");
        for(Object object : set) {
          //System.out.println(Collections.frequency(arrayList, object));
            System.out.println(object+"," +Collections.frequency(arrayList, object));

			/*
			 * int count=0; for(Object object1 : arrayList) {
			 * 
			 * if(object==object1) { count++; hashMap3.put(object, count); } }
			 */
		}
        ArrayList arrayList2=new ArrayList();
        arrayList2.addAll(hashMap3.entrySet());
        
        Iterator iterator3=arrayList2.iterator();
        while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
			
		}
	}

}
