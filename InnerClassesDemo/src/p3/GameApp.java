package p3;

class Football implements Game
{
	@Override
	public void playGame(int count) {
		// ...... code for football
		
	}
	


}

public class GameApp {

	public static void main(String[] args) {
		
		Football football = new Football();
		
		// highly coupled (depended) on Game Implementation  // SOLID Principals 
		new GameApp().startGame(football);
		
		
	}
	
	public void startGame(Game game)
	{
		game.playGame(12);
	}
	
}
