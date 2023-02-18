package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxAndMin {
	static String solution(String s) {
	    String answer = "";
	    String[] nums =s.split("\\s");
	    
	    
	    //int로 변환해 arrayList 에 담음
	    ArrayList<Integer> intarr = new ArrayList<Integer>();
	    for(String num: nums ) {
	    	intarr.add(Integer.parseInt(num));
	    }
	    
	    //최댓값, 최솟값 구하기
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    //1. 최댓값 최솟값 비교로 풀기
	    for(int intnum : intarr) {
	    	if (intnum > max) {
				max = intnum;
			}
	    	if (intnum < min) {
	    		min = intnum;
	    	}
	    }
	    //2. 정렬로 풀기
	    Integer[] arr = intarr.toArray(new Integer[intarr.size()]);
	    for(int i = 0; i < intarr.size();i++) {
	    	for(int j = i+1; j < intarr.size(); j++) {
	    		// arr[i] 값이 arr[i+1]의 값보다 크면 [i]와 [i+1]값 스왑
	    		if (arr[i] > arr[j]) {
	    			int temp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = temp;	
				}
	    	}
	    }
	    min= arr[0];
	    max = arr[arr.length-1];
	    
	    
	    answer = min +" "+max;
	    return answer;
	}
	
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		System.out.println(solution(s));
	}
}
