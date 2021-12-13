package TicTacToe;

public class main_TicTacToe {
	static int score1 = 0;
	static int score2 = 0;
	static int yCor = 0;
	static int xCor = 0;
	static int inputVal = 0;
	static boolean play = true;
	static boolean moveTest = false;
	static String player1 = "Player 1";
	static String player2 = "Player 2";
	static String BotName = "Bot";
	static boolean twoplayer = false;
	static boolean newGame;
	
	
	public static void main(String[] args) {
		

		
		System.out.println("_____________________________________________");
		System.out.println("|                                            |");
		System.out.println("|               QUASOLARIS                   |");
		System.out.println("|                                            |");
		System.out.println("|               TIC-TAC-TOE                  |");
		System.out.println("|____________________________________________|");
		
		
		playfield v1 = new playfield();
		bot b1 = new bot(v1, 'O');
		BotName = b1.getBotname();
		
		
		v1.printPlayfield();
		System.out.println("----------------------");
		System.out.println("One or Two Player? (1/2)");
		do {
			try {
				inputVal = Terminal.readInt();
			}catch(NumberFormatException ex) {
				
				inputVal = 3;
			}
		}while(inputVal > 2);
		
		if(inputVal==1) {
			twoplayer = false;
		}
		else {
			twoplayer = true;
		}
		
		
		System.out.println("----------------------");
		do {
			
			v1.cleanField();
			
			//Two players
			if(twoplayer) {
				do{
					System.out.println("Number of moves: " + v1.getmovecount());
					System.out.println(player1 + ": " + score1 + " | " + player2 + ": " + score2);
					System.out.println("-------------------------");
					//Player 1 move
					while(!moveTest) {
						
						System.out.println(player1 + " insert Y-Cor.: ");
						do {
							System.out.println("Insert number (0-2)");
							try {
								yCor = Terminal.readInt();
							}catch(NumberFormatException ex) {
							    yCor = 3;
							}
						}while(yCor >= 3);
						
						System.out.println(player1 + " insert X-Cor.: ");
						do {
							System.out.println("Insert number (0-2)");
							try {
								xCor = Terminal.readInt();
							}catch(NumberFormatException ex) {
							    xCor = 3;
							}
						}while(xCor >= 3);
						
						moveTest = v1.setMove(yCor, xCor, 'X');
						v1.printPlayfield();
					}
					
					if(v1.gameOver('X')) {
						System.out.println("Game Over: " + player1 + " won!");
						score1++;
						moveTest = true;
						break;
						}
					else{
						moveTest = false;
					}
					
					if(v1.isFull()) {
						play = false;
						System.out.println("-------------------------");
						System.out.println("Draw!");
						System.out.println("-------------------------");
						break;
						}
					System.out.println("-------------------------");
					//Player 2 move
					while(!moveTest) {
						
						System.out.println(player2 + " insert Y-Cor.: ");
						do {
							System.out.println("Insert number (0-2)");
							try {
								yCor = Terminal.readInt();
							}catch(NumberFormatException ex) {
							    yCor = 3;
							}
						}while(yCor >= 3);
						
						System.out.println(player2 + " insert X-Cor.: ");
						do {
							System.out.println("Insert number (0-2)");
							try {
								xCor = Terminal.readInt();
							}catch(NumberFormatException ex) {
							    xCor = 3;
							}
						}while(xCor >= 3);
						
						moveTest = v1.setMove(yCor, xCor, 'O');
						v1.printPlayfield();
					}
					moveTest = false;
					if(v1.gameOver('O')) {
						System.out.println("Game Over: " + player2 + " won!");
						score2++;
						moveTest = true;
						break;
					}
					System.out.println("-------------------------");
					
					
					if(v1.isFull()) {
						play = false;
						System.out.println("-------------------------");
						System.out.println("Draw!");
						System.out.println("-------------------------");
						break;
						}
					
					
				}while(play);
			}
			
			
			
			//One player
			if(!twoplayer) {

				player2 = BotName;
				
				System.out.println("Coose difficulty (1 = Easy  |  2 = Normal)");
				
				do {
					try {
						inputVal = Terminal.readInt();
					}catch(NumberFormatException ex) {
						System.out.println("Insert number (0-2)");
						inputVal = 3;
					}
				}while(inputVal > 2);
							
				if(inputVal==1) {
					b1.setDifficulty(true);
					System.out.println("Difficulty: Easy");
				}
				else {
					b1.setDifficulty(false);
					System.out.println("Difficulty: Hard");
				}
				
				
				do{
					System.out.println("Number of moves: " + v1.getmovecount());
					System.out.println(player1 + ": " + score1 + " | " + player2 + ": " + score2);
					System.out.println("-------------------------");
					//Player 1 move
					while(!moveTest) {
						
						System.out.println(player1 + " insert Y-Cor.: ");
						do {
							System.out.println("Insert number (0-2)");
							try {
								yCor = Terminal.readInt();
							}catch(NumberFormatException ex) {
							    yCor = 3;
							}
						}while(yCor >= 3);
						
						System.out.println(player1 + " insert X-Cor.: ");
						
						do {
							System.out.println("Insert number (0-2)");
							try {
								xCor = Terminal.readInt();
							}catch(NumberFormatException ex) {
							    xCor = 3;
							}
						}while(xCor >= 3);
						
						moveTest = v1.setMove(yCor, xCor, 'X');
						v1.printPlayfield();
					}
					
					if(v1.gameOver('X')) {
						System.out.println("Game Over: " + player1 + " won!");
						score1++;
						moveTest = true;
						break;
						}
					
				
					else{
						moveTest = false;
					}
					
					if(v1.isFull()) {
						play = false;
						System.out.println("-------------------------");
						System.out.println("Draw!");
						System.out.println("-------------------------");
						break;
						}
					
					System.out.println("-------------------------");
					
					
					//Bot move
					b1.setMove();
					v1.printPlayfield();
					if(v1.gameOver('O')) {
						System.out.println("Game Over: " + player2 + " won!");
						score2++;
						moveTest = true;
						break;
					}
					System.out.println("-------------------------");
					
					
					if(v1.isFull()) {
						play = false;
						System.out.println("-------------------------");
						System.out.println("Draw!");
						System.out.println("-------------------------");
						break;
					}
					
				}while(play);
			}
			
			System.out.println();
			System.out.println("-------------------------");
			System.out.println("Game summary:");
			System.out.println("Number of moves: " + v1.getmovecount());
			System.out.println(player1 + ": " + score1 + " | " + player2 + ": " + score2);
			System.out.println("-------------------------");
			
			v1.printHistory();
			
			System.out.println("-------------------------");
			System.out.println("New Game? (1/0)");
			play = Terminal.readBool();
			
		}while(play);
		System.out.println("---Game Shutdown---");
	}


}