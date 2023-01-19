package kr.co.ezenac.set02;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Anne");
		treeSet.add("Shupen");
		treeSet.add("Val");
		treeSet.add("Tom");
		treeSet.add("Shupen");	// 중복 불가
		
		for(String str : treeSet)
			System.out.println(str);
	}
}
