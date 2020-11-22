package p3;



public class GameAppAnymousInnerClass {

	public static void main(String[] args) {
		
		// highly coupled (depended) on Game Implementation  // SOLID Principals 
		
		
		new GameAppAnymousInnerClass().startGame(new Game() {

			@Override
			public void playGame(int count) {
				// TODO Auto-generated method stub
				System.out.println("game played by "+count);
			}
		});
		
	
		
		
		
	}
	
	public void startGame(Game game)
	{
		game.playGame(12);
	}
	
}
