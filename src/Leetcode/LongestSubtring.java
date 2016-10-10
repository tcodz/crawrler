package Leetcode;

import java.util.*;

public class LongestSubtring {
    public static int solution(String s){
    	Set<Character> set1=new HashSet<>();int result=0;
    	for(int i=0;i<s.length();i++){
    		set1.clear();int top=i;
    		while(top<s.length()&&!set1.contains(s.charAt(top))){
                 set1.add(s.charAt(top));
                 top++;
    		}
    		if(set1.size()>result) result=set1.size();
    	}
    	return result;
    }
	public static void main(String[] args) {
      String string="pwwkew";
      System.out.println(solution(string));
	}

}
