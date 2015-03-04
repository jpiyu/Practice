import static java.lang.System.*;
import java.io.*;
import java.util.*;
class Point
{
	int x;
	int y;
	Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}
class Rectangle
{
	Point topLeft,bottomRight;
	Rectangle(int x1,int y1,int x2,int y2)
	{
		topLeft = new Point(x1,y1);
		bottomRight = new Point(x2,y2);
	}
}
public class CheckingIfRectangleIntersect 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter the endpoints of 1st rectangle");
		String[] str = br.readLine().split(" ");
		Rectangle r1 = new Rectangle(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3]));
		System.out.println("enter the endpoints of the 2nd rectangle");
		String[] str1 = br.readLine().split(" ");
		Rectangle r2 = new Rectangle(Integer.parseInt(str1[0]),Integer.parseInt(str1[1]),Integer.parseInt(str1[2]),Integer.parseInt(str1[3]));
		if(r1.topLeft.x > r2.bottomRight.x || r1.bottomRight.x < r2.topLeft.x || r2.topLeft.y < r1.bottomRight.y || r2.bottomRight.y > r1.topLeft.y)
		{
			System.out.println("The rectangles do not intersect");
		}
		else
		{
			System.out.println("The rectangles intersect");
		}
	}
}
