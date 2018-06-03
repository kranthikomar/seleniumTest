package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> hm = new HashMap<Integer,String>();
hm.put(3, "b");
hm.put(1, "c");
hm.put(2, "a");
hm.putIfAbsent(1, "d");
System.out.println(hm);
Map<Integer,String> hm2 = new TreeMap<Integer,String>();
hm2.put(3, "b");
hm2.put(1, "c");
hm2.put(2, "a");
System.out.println(hm2);
System.out.println(hm.equals(hm2));

ArrayList<String> al = new ArrayList<String>();
al.add("b");
al.add("c");
al.add("a");
//Collections.sort(al);
System.out.println(hm.equals(al));

int number = 12321;
int n=0;
int temp;
while(number>0){
	temp = number%10;
	n = n+ temp;
	number = number/10;
}
System.out.println(n);
	}

}
