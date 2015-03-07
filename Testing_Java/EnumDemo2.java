import static java.lang.System.*;
enum Cars {MARUTI , TOYOTA , BMW, MERCEDES};
class SelectCar
{
 	Cars car;
}
class EnumDemo2
{
	public static void main(String[] args)
	{
	    SelectCar sc1 = new SelectCar();
	    SelectCar sc2 = new SelectCar();
		sc1.car = Cars.BMW;
		out.println(sc1.car);
		sc1 = sc2;
	}
}