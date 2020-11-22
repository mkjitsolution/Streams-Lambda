package p2;

public class Bus {

	class Engine
	{
		public int getPower()
		{
			return 3000;
		}
		public void startEngine()
		{
			
		}
	}
	
	// Engine e;
	
	public void move()
	{
		Engine e = new Engine();
		e.startEngine();
		int power = e.getPower();
	}
	
}
