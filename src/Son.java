
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
