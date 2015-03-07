public interface i1 {
    
    public void method1(int i);
    
}


public class class1 implements i1 {
    
    public void method1(int i)
    {
        for (int j=0;j<10;j++)
            System.out.print(i);
    }
    
}

class java {
    public static void main(String[] args)
    {
        class1 c = new class1();
        c.method1(2);
        
    }
}
