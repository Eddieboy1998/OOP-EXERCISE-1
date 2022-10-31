public class MainProgram{
	public static void main(String[] args) {
		Child baby;
		Son son = new Son("Ivan",5," Normal");
		Daughter daughter = new Daughter("Shannara",4,"PhilKorean");

		baby = son;
		System.out.println(baby.makeSound() + " " + "My name is " + baby.getName());

		baby = daughter;
		System.out.println(baby.makeSound() + " " + "My name is " + baby.getName());
	}
}

