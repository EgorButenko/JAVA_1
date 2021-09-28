abstract class Animal implements IAnimal{
	
	protected String name;
	protected String color;
	protected int age;
	
	Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public String toString(){
		return name;
	}
	
}
