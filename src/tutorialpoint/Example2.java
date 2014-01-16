package tutorialpoint;

public class Example2 
{
	//default constructor
	public Example2()
	{
		
	}
	
	//constructor with 1 param
	public Example2(String name)
	{
		
	}
	
	String breed;
	int age;
	String color;
	
	public String barking()
	{
		System.out.println("dog is barking");
		return "s";
	}
	
	public String sleeping()
	{
		return "dog is sleeping";
	}
	
	public String eating()
	{
		return "dog is eating";
	}
	
	public static void main(String[] args)
	{
		Example2 dog = new Example2();
		
		dog.breed = "male";
		dog.age = 2;
		dog.color = "black";
		
		dog.barking();
		dog.sleeping();
		dog.eating();
		
	}
	
}
