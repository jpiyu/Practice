import java.util.Date;

public class ComparisonOfDates2 {
	public static void main(String[] args) {
		Date date1 = new Date();
		try
		{
			Thread.sleep(2000);

		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		Date date2 = new Date();
		int result = date1.compareTo(date2);
		if(result >0)
			System.out.println("first date is after the second");
		else if(result <0)
			System.out.println("second date is after the first one");
		else
			System.out.println("both the dates are equal");
	}
}
