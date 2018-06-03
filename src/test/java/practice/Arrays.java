package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
		/**
		 * @param args
		 */
		public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("b");
		al.add("c");
		al.add("a");
		System.out.println("Arraylist before sorting:"+al);
		Collections.sort(al);
		System.out.println("Arraylist after sorting:"+al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("a");
		al2.add("b");
		System.out.println(al.contains(al2));
	}

}
