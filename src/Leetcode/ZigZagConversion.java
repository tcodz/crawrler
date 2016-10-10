package Leetcode;

import java.util.Scanner;

public class ZigZagConversion {
    public static String solution(String s,int umrow){
    		StringBuilder sBuilder=new StringBuilder(s.length());
    		String result;
    		int flag=(umrow-1)*2;
    		for(int i=0;i<umrow;i++)
    			for(int j=i;j<s.length();j+=flag){
    				sBuilder.append(s.charAt(j));
    				if(i>0&&i<umrow-1){
    					int t=j+flag-2*i;
    					if(t<s.length())
    						sBuilder.append(s.charAt(t));
    				}
    					
    			}
    		result=sBuilder.toString();
    		return result;
    }
	public static void main(String[] args) {
		   String string="PAYPALISHIRING";
		   System.out.println(solution(string, 3));
	}

}
