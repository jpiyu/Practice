import static java.lang.System.*;
import java.util.Date;

class FileClock implements Runnable
{
  public void run()
  {
	  for (;;)
	  {
		  Date d = new Date();
	     System.out.printf("%s\n", d);
	        try
	        {
	          Thread.sleep(1000);
	        } catch (InterruptedException e)
	        {
	          System.out.printf("The FileClock has been interrupted");
	        }
      }
  }
}
  public class ClockDemo
  {
  	public static void main(String[] args)
  	{
		FileClock clock=new FileClock();
		    Thread thread=new Thread(clock);
            thread.start();
             try {
			      Thread.sleep(5000);
			     }
			    catch (InterruptedException e)
			    {
			      e.printStackTrace();
                }
    thread.interrupt();
   }
}