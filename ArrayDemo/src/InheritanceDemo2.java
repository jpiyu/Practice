import static java.lang.System.*;

interface Shape {
	public void shape();
}
class Circle implements Shape
{
	Circle()
	{
		System.out.println("inside circle's constructor");
	}
	public void shape()
	{
		System.out.println("the shape is round");
	}
}
class Square implements Shape
{
	Square()
	{
		System.out.println("inside square's constructor");
	}
	public void shape()
	{
		System.out.println("all the sides are equal");
	}
}
class Rectangle implements Shape
{
	Rectangle()
	{
		System.out.println("inside rectangle's constructor");
	}
	public void shape()
	{
		System.out.println("all sides are not equal");
	}
}
public class InheritanceDemo2 {
	public static void main(String[] args)
	{
		Shape s[] = new Shape[3];
		s[0] = new Circle();
		s[1] = new Square();
		s[2] = new Rectangle();
		
	}
}
