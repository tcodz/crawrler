package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GenericMethods {
    public  static<T> List<T> list(){
    	return new LinkedList<>();
    }
    public static void use(List<Integer> list){
    	list.add(1);list.add(2);
    	System.out.println(list);
    }
	public static void main(String[] args) {
		use(list());
	}

}
