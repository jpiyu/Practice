import static java.lang.System.*;

class Animal
{
	public void eat()
	{
		System.out.println("Animal eat Food");
	}
}
class Horse extends Animal
{
	public void eat()
	{
		System.out.println("Horse eats Grass");
	}
}
public class ReferenceBasicDemo
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.eat();
		Animal a = new Horse();
		a.eat();
	}
}
