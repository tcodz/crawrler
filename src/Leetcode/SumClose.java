package Leetcode;
import java.util.*;
public class SumClose {
    public static int solution(int nums[],int target){
    	if(nums.length<3) {return 0;}
    	if(nums.length==3){return nums[0]+nums[1]+nums[2];}
    	Arrays.sort(nums);int result=Integer.MAX_VALUE-Math.abs(target);
    	for(int i=0;i<nums.length-2;i++){
    	    int low=i+1;int high=nums.length-1;int sum=Integer.MAX_VALUE-Math.abs(target);
    	    while(low<high){
    	    	int sumlh=nums[low]+nums[high]+nums[i];
    	    	if(sumlh==target)return target;
    	    	if(sumlh<target){
    	    		if(Math.abs(sum-target)>=Math.abs(sumlh-target)){
    	    			sum=sumlh;low++;
    	    		}else{
    	    			break;
    	    		}
    	    	}
    	    	if(sumlh>target){
    	    		if(Math.abs(sum-target)>=Math.abs(sumlh-target)){
    	    			sum=sumlh;high--;
    	    		}else{
    	    			break;
    	    		}}
    	    }
    	    if(Math.abs(sum-target)<Math.abs(result-target))   result=sum;
    	}
    	return result;
    }
	public static void main(String[] args) {
		int[] a={1,1,1,0};
		System.out.println("result is "+solution(a,100));
	}

}
