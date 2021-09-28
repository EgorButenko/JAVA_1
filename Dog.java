class Dog extends Animal{
	
	String name;
	String color;
	int age;
	
	Dog(String name, String color, int age){
		super (name, color, age);
	}
	@Override
	public void run(int i){
		if(i <= 500){
			System.out.println(toString() + " ran " + i + " meters");
		}else{
			System.out.println("Dog can't run that far");
		}
	}
	@Override
	public void swim(int i){
		if(i <= 10){
			System.out.println(toString() + " swam " + i + " meters");
		}else{
			System.out.println("Dog can't swim that far");
		}
	}
	
}
