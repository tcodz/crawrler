package Leetcode;

import java.nio.channels.MulticastChannel;

public class ContainerWithMostWater {
    public static int solution(int[] height){
    	int result=0;int i=0;int j=height.length-1;
    	while(i<j){
    		result=Math.max(result, (j-i)*Math.min(height[i], height[j]));
    		if(height[j]>height[i]){
    			int k=i+1;
    			for(;height[k]<=height[i];k++){}
    			i=k;
    		}else{
    			int k=j-1;
    			for(;height[k]<=height[j];k--){}
    			j=k;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		int[] test={5,3,1,9,2};
		System.out.println(solution(test));
	}

}
