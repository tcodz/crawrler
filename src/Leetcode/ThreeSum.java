package Leetcode;

import java.lang.reflect.Array;
import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ThreeSum {
	public static List<List<Integer>> bestsolution(int[] nums){
		List<List<Integer>> result=new LinkedList<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i==0||(i!=0&&nums[i]!=nums[i-1])){
				int low=i+1;int high=nums.length-1;int sum=-nums[i];
				while(low<high){
				if(nums[low]+nums[high]==sum){
					result.add(Arrays.asList(nums[i],nums[low],nums[high]));
					while(low<high&&nums[low]==nums[low+1]) low++;
					while(low<high&&nums[high]==nums[high-1]) high--;
					low++;high--;
				}else if(nums[low]+nums[high]>sum) high--;
				else low++;
				}
			}
		}
	return result;
	}
    public static List<List<Integer>> solution(int[] arr){
    	Arrays.sort(arr);
    	LinkedList<List<Integer>> list2=new LinkedList<>();
    	for(int i=0;i<arr.length-2;i++){
    		for(int j=i+1;j<arr.length-1;j++)
    			for(int k=j+1;k<arr.length;k++){
    			if(arr[i]+arr[j]+arr[k]==0){
    				List<Integer> list1=new LinkedList<Integer>(Arrays.asList(arr[i],arr[j],arr[k]));
    				if(list2.peek()==null)
    					list2.add(list1);
    				else{
    					if(list2.element().get(0)==list1.get(0)&&list2.element().get(1)==list1.get(1)&&list2.element().get(2)==list1.get(2))
    						 ;
    					else
    						list2.add(list1);
    					break;
    				}
    			}
    				
    		}
    	}
    	return list2;
    	
    }
	public static void main(String[] args) {
		int[] arr={-1,0,1,2,-1,4};
		List<List<Integer>> list=bestsolution(arr);
		for(List slist: list)
			System.out.println(slist);
	}

}
