import java.util.Date;


public class ComparisonOfDates {
public static void main(String...strings) throws InterruptedException
{
	Date date1 = new Date();
	Thread.sleep(2000);
	Date date2 = new Date();
	Boolean afterOrNot = date2.after(date1);     // similarly before() method can also be used // 
	System.out.println(afterOrNot);
}
}
