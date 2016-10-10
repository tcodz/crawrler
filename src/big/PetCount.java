package big;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.management.RuntimeErrorException;

class Individual{
	String name;
	static int count;
	final int id=count;
	public int id(){return id;}
	public Individual() {count++;}
	public Individual(String name){count++;this.name=name;}
}

class Person extends Individual{
	public Person(String name){super(name);}
}

class Pet extends Individual{
	public Pet(){super();}
	public Pet(String name){super(name);}
}

class Dog extends Pet{
	public Dog(){super();}
	public Dog(String name){super(name);}
}

class Mutt extends Dog{
	public Mutt(String name){super(name);}
	public Mutt(){super();}
}

class Pug extends Dog{
	public Pug(String name){super(name);}
	public Pug(){super();}
}

class Cat extends Pet{
	public Cat(String name){super(name);}
	public Cat(){super();}
}

class EgyptianMau extends Cat{
	public EgyptianMau(String name){super(name);}
	public EgyptianMau(){super();}
}

class Manx extends Cat{
	public Manx(String name){super(name);}
	public Manx(){}
}

class Cymric extends Cat{
	public Cymric(String name){super(name);}
	public Cymric(){}
}

class Rodent extends Pet{
	public Rodent(String name){super(name);}
	public Rodent(){}
}

class Rat extends Rodent{
	public Rat(String name){super(name);}
	public Rat(){}
}

class Mouse extends Rodent{
	public Mouse(String name){super(name);}
	public Mouse(){}
}

class Hamster extends Rodent{
	public Hamster(String name){super(name);}
	public Hamster(){}
}

abstract class PetCreator{
	private Random rand=new Random(47);
	public abstract List<Class<? extends Pet>> types();
	public Pet randomPet(){
		int n=rand.nextInt(types().size());
		try{
			return types().get(n).newInstance();
		}catch (InstantiationException e) {
			throw new RuntimeException();
			}
		catch (IllegalAccessException e) {
			throw new RuntimeException();
			}
	}
	public Pet[] createArray(int n){
		Pet[] result=new Pet[n];
		for(int i=0;i<n;i++)
			result[i]=randomPet();
		return result;
	}
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result=new ArrayList<>();
		Collections.addAll(result, createArray(size));
		return result;
	} 
}

class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types=new ArrayList<>();
	private static String[] typeNames={
			"big.Mutt",
			"big.Pug",
			"big.EgyptianMau",
			"big.Manx",
			"big.Cymric",
			"big.Rat",
			"big.Mouse",
			"big.Hamster"
	};
	@SuppressWarnings("unchecked")
	private static void loader(){
		try{
			for(String name:typeNames)
				types.add((Class<? extends Pet>)Class.forName(name));
		}catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
			}
	}
	static {loader();}
	public List<Class<? extends Pet>> types() {return types;}
}

public class PetCount {

	public static void main(String[] args) {
		
	}

}
