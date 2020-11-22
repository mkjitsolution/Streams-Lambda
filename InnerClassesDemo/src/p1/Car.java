package p1;

public class Car {

	Engine e;
	
	public void startCar()
	{
		// step 1 
		e = new Engine();
		e.startEngine();
		int power = e.getPower();
		
	}
	
}
