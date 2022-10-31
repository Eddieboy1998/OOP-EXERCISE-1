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
