import java.util.Calendar;
import java.util.Date;


public class GettingDate {
public static void main(String... args)
{
	Calendar calendar = Calendar.getInstance();
	Date dateAndTime = calendar.getTime();
	System.out.println(dateAndTime.toString());
	
}
}
