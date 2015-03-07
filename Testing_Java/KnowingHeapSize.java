import static java.lang.System.*;
class A
{
	int i;
	int j;
	A()
	{
		i = 20;
		j = 20;
	}
}
public class KnowingHeapSize{

       private static final int MegaBytes = 10241024;

       public static void main(String args[]) {

              long freeMemory = Runtime.getRuntime().freeMemory()/MegaBytes;
              long totalMemory = Runtime.getRuntime().totalMemory()/MegaBytes;
              long maxMemory = Runtime.getRuntime().maxMemory()/MegaBytes;

              System.out.println("JVM freeMemory: " + freeMemory);
              System.out.println("JVM totalMemory also equals to initial heap size of JVM : "
                                         + totalMemory);
              System.out.println("JVM maxMemory also equals to maximum heap size of JVM: "
                                         + maxMemory);

             A a = new A();
             A b = new A();

              freeMemory = Runtime.getRuntime().freeMemory() / MegaBytes;
              totalMemory = Runtime.getRuntime().totalMemory() / MegaBytes;
              maxMemory = Runtime.getRuntime().maxMemory() / MegaBytes;

              System.out.println("Used Memory in JVM: " + (maxMemory - freeMemory));
              System.out.println("freeMemory in JVM: " + freeMemory);
              System.out.println("totalMemory in JVM shows current size of java heap : "
                                         + totalMemory);
              System.out.println("maxMemory in JVM: " + maxMemory);

       }
}
