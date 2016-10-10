package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class isPalindrome {
	public static boolean bestSolution(int x){
		if(x<0||(x!=0&&x%10==0)) return false;
		int p=0;
		while(x>p){
			p=p*10+x%10;
			x/=10;
		}
		return (x==p||x==p/10);
	}
    public static boolean mySolution(int x){
    	
    	  if(x<0) x=-x;
    	  boolean result=true;
    	  String string=Integer.toString(x);
          char[]c=string.toCharArray();
          int low=0;int high=c.length-1;
          while(low<high&&result==true){
        	  if(c[low]==c[high])
        		  result=true;
        	  else
        		  result=false;
        	  low++;high--;
          }
          return result;
    
    }
    
	public static void main(String[] args) {
		System.out.println(bestSolution(123321)	);
		
	}

}
