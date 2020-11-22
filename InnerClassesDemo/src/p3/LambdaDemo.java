package p3;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		Game football = new Game() {
			
			@Override
			public void playGame(int count) {
				System.out.println("Main players "+count*0.75);
				System.out.println("Extra players "+count*0.25);
					
			}
		};
		football.playGame(12);
		
		
		Game abc = (int count)-> {
			System.out.println("Main players "+count*0.75);
			System.out.println("Extra players "+count*0.25);
		};
		abc.playGame(100);
		
	}//end main

}
