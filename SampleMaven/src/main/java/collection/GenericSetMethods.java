package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {
	
	public static void main(String[] args) {
	Set<Integer> set=new HashSet<Integer>();
	//add method
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	set.add(60);
	
	Set<Integer> set1=new HashSet<Integer>();
	set1.add(120);
	set1.add(130);
	//addall method
	set.addA11(set1);
	
	System.out.println(set);
	//contains method
	System.out.println("is set contains 50 -"+set.contains(50));
	System.out.println("is set contains 10 -"+set.contains(10));
	
	//containsall method
	
	System.out.println("is set contains all elements of set1 -"+set.containsAll(set1));
	Sysem.out.println("is set1 contains all elements of set -"+set1.containsAll(set1));
	
	//isempty
	
	System.out.println("is set Empty()
	
	
	
	}
	

}
