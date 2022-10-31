
import java.sql.*;
import org.w3c.dom.*;public abstract class Child 
{ protected String name ;
  protected int Age;
  
  public Child ( String name, int Age) {
	  this.name = name;
	  this.Age = Age;
  }
  public abstract String makeSound();
  
  public String getName() {
	  return name;
  }
  
  public void setName(String name){
	  this.name = name;
  }
  public int getAge() {
	  return Age;
  }
  public void setAge(int Age) {
	  this.Age = Age;
  }

  
public class Son extends Child {
	private String Type ;
	
	public Son(String name, int Age, String Type) {
		super(name , Age);
		this.Type = Type;
	}
	@Override
	public String makeSound() {
		return "Hi";
	}
	public String getType() {
		return Type;
	}
	public void setType(String Type){
		this.Type = Type;
	}
}
}

 class Daughter extends Child {
	private String breed;
	
	
	public Daughter(String Name, int Age , String breed) {
		super(Name , Age);
		this.breed = breed;
	}
	@Override
	public String makeSound() {
		return "Hello";
	}
	public String getbreed() {
		return breed;
	}
	public void setName(String breed) {
		this.breed = breed;
		
	}
}
class MainProgram{
	public static void main(String[] args) {
		Child baby;
		Son son = new Son("Ivan", 5, "Normal");
		Daughter daughter = new Daughter("Shannara",4,"PhilKorean");

		baby = son;
		System.out.println(baby.makeSound() + " " + "My name is " + baby.getName());

		baby = daughter;
		System.out.println(baby.makeSound() + " " + "My name is " + baby.getName());
	}
}

