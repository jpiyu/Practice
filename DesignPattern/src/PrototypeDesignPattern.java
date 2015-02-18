import static java.lang.System.*;
import java.io.*;
interface Cloning
{
	public Cloning getClone();
}
class Prototype implements Cloning
{
	int id;
	String name;
	
	Prototype(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Cloning getClone()
	{
		return new Prototype(id,name);
	}
	public void showDetails()
	{
		System.out.println("the details are");
	}
}
public class PrototypeDesignPattern {
	public static void main(String []args) throws IOException
	{
		Prototype object1 = null, object2 = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the id of the employee");
		int id = Integer.parseInt(br.readLine());
		System.out.println("enter the name of the employee");
		String name = br.readLine();
		
		object1 = new Prototype(id, name);
		
		System.out.println("do you want to make a clone object");
		String answer = br.readLine();
		if(answer == "y" | answer == "Y")
		{
			object2 = (Prototype)object1.getClone();
		}
		object2.showDetails();
	}

}
