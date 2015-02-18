import static java.lang.System.*;

import java.util.Calendar;

public class CompleteDateTime {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("Current date is" + now.get(Calendar.YEAR));
		System.out.println("Current month is" + now.get(Calendar.MONTH));
		System.out.println("Current day is" + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("Current date is" + now.get(Calendar.DATE));
		System.out.println("NOW SHOWING THE TIME");
		System.out.println("Current Hour is" + now.get(Calendar.HOUR));
		System.out.println("Current Minute is" + now.get(Calendar.MINUTE));
		System.out.println("Current Second is" + now.get(Calendar.SECOND));
	}

}
