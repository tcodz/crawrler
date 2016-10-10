package generics;

import java.util.Iterator;

public class Fibonacci implements Generator<Integer>,Iterable<Integer>{
    private int count=0;
    public Fibonacci() {}
    private int size=0;
    public Fibonacci(int size){this.size=size;}
	public Integer next(){return fib(count++);}
	private int fib(int n){
		if(n<2) return 1;
		return fib(n-2)+fib(n-1);
	}
	private class FibonacciIterator implements Iterator<Integer>{
		public boolean hasNext(){return size>0;}
		public Integer next(){size--;return Fibonacci.this.next();}
		public void remove(){throw new UnsupportedOperationException();}
	};
	public Iterator<Integer> iterator(){return new FibonacciIterator();}
	public static void main(String[] args) {
		Fibonacci gen=new Fibonacci();
		for(int i=0;i<18;i++)
			System.out.print(gen.next()+" ");
		System.out.println();
		for(Integer i:new Fibonacci(18))
			System.out.print(i+" ");
	}

}
