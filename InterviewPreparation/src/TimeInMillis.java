import java.util.Date;
import java.util.Calendar;


public class TimeInMillis {
	public static void main(String[] args)
	{
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		System.out.println(calendar.getTimeInMillis());
		System.out.println(date.getTime());
	}
}
