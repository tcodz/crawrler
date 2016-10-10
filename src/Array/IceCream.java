package Array;

import java.lang.*;
import java.sql.ResultSet;
import java.util.*;

public class IceCream {
    private static Random random=new Random(47);
    static final String[] FLAVORS={"Chocalate","Strawberry","Vanilla Fudge Swirl","Mint Chip","Mocha Almond Fudge"
    		,"Rum Raisin","Praline Cream","Mud Pie"};
    public static String[] flavorSet(int n){
    	if(n>FLAVORS.length)
    		throw new IllegalArgumentException("Set too big");
    	String[] result=new String[n];
    	boolean[] picked=new boolean[FLAVORS.length];
    	for(int i=0;i<n;i++){
    		int t;
    		do {
				t=random.nextInt(FLAVORS.length);
			} while (picked[t]);
    		result[i]=FLAVORS[t];
    		picked[t]=true;
    	}
    	return result;
    }
	public static void main(String[] args) {
		List<String>sList=new LinkedList<>();
		Collections.addAll(sList, "ddd","sss","dbd");
		List<String>rList;
		rList=sList.subList(0, sList.size());
		System.out.println(sList.size());
		
	}

}
