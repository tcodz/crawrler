package Leetcode;

import java.util.*;

public class GenerateParentheses {
	private static void helper(List<String> res,String present,int left,int right){
		if(left==0&&right==0){
			res.add(present); return ;
			}
		if(left>0){
			helper(res, present+'(', left-1, right);
		}
		if(right>left){
			helper(res, present+')', left, right-1);
		}
	} 
    public static List<String> solution(int n){
    	List<String> res=new LinkedList<>();
    	helper(res, "", n, n);
    	return res;
    }
	public static void main(String[] args) {
		List<String> reStrings=solution(5);
		System.out.println(reStrings);
	}

}
