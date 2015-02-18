import static java.lang.System.*;
import java.io.*;
public class InsertionSortOnObjects {
	public static void main(String[] args)
	{
		Accessor a = new Accessor(4);
		a.add("Piyush", "Joshi");
		a.add("Umesh","Joshi");
		a.add("Damayanti","Joshi");
		a.add("Nanda Ballabh","Joshi");
		a.display();
	}
}
class Person
{
	String firstName,lastName;
	int elements;
	Person(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
class Accessor
{
	Person[] p;
	int nElements;
	Accessor(int size)
	{
		p = new Person[size];
		this.nElements = 0;
	}
	public void add(String firstName,String lastName)
	{
		p[nElements++] = new Person(firstName,lastName);
	}
	public void display()
	{
		for(int i=0;i<this.nElements;i++)
		{
			System.out.println("Element no:"+ (i+1)+" "+ p[i].firstName+" "+ p[i].lastName);
		}
	}
}