import static java.lang.System.*;
class Animal {
   public void eat() {
      System.out.println("Generic Animal Eating Generically");
   }

}
class Horse extends Animal {
   public void eat() {                 // OVERRIDDEN //
       System.out.println("Horse eating hay ");
   }
   public void eat(String s) {         // OVERLOADED //
            System.out.println("Horse eating " + s);
   }

}
public class MethodOverloadingDemo2
{
	public static void main(String[] args)
	{
		Animal ah2 = new Horse();
		ah2.eat();
	}
}
