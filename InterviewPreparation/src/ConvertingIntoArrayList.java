import static java.lang.System.*;
import java.util.*;
class ConvertingIntoArrayList
{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("piyush");
		list.add("joshi");
		list.add("umesh");
		list.add("joshi");
		
		Object[] object = list.toArray();
		
		String[] arr = Arrays.copyOf(object,object.length,String[].class);
		for(String str : arr)
		{
			System.out.println(str);
		}
	}
}