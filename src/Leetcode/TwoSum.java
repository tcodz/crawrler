package Leetcode;

import java.util.*;

public class TwoSum {
    public static int[] Sum(int[] sums,int target){
    	int[] result=new int[2];
    	Map<Integer,Integer> map=new HashMap<>();
    	for(int i=0;i<sums.length;i++)
    		if(!map.containsKey(target-sums[i]))
    			map.put(sums[i], i);
    		else{
    			result[0]=map.get(target-sums[i]);
    			result[1]=i;
    			break;
    		}
    	return result;
    }
	public static void main(String[] args) {
		int[] a={3,2,4};
		int target=6;
		int[] b=new int[2];
		b=Sum(a, target);
		for(int i:b)
			System.out.println(i+" ");
	}

}
