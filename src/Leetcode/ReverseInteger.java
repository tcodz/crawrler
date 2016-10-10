package Leetcode;

import java.util.FormatFlagsConversionMismatchException;

public class ReverseInteger {
    public static int solution(int x){
    	long r=0;long x1=Math.abs((long)x);
        while(x1!=0){
            r=x1%10+r*10;
            x1=x1/10;
        }
        if(r>Integer.MAX_VALUE) return 0;
        return (int)r;
    }
	public static void main(String[] args) {
	   System.out.println(solution(-2147483648));
	}

}
