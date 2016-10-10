package Array;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        System.out.println(s(4));
	}
	public static long s(int n){
		if(n==1)
			return 1;
		else return s(n-1)+n;
	}
	
}


