package tutorialpoint;

public class Puppy
{
	int puppyAge;
	
	public Puppy(String name)
	{
		System.out.println("passed name: " + name);
	}
	
	public void setAge (int age)
	{
		puppyAge = age;
	}
	
	public int getAge()
	{
		System.out.println("puppy age: " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String []args)
	{
		Puppy mypuppy = new Puppy("ham");
		
		mypuppy.setAge(2);
		
		mypuppy.getAge();
		
		System.out.println("accessing variable: " + 
				mypuppy.puppyAge);
		
	}
}
