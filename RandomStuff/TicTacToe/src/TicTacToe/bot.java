package TicTacToe;
import java.util.Random;

public class bot {
	private char[][] playfield;
	private int[][] history;
	private int[][] winPositions;
	private int[][] playermoves;
	private int[] nextMove;
	private int[] solutionPosition;
	private String[] botNames;
	private int playermovecount = 0;
	private int x, y;
	private boolean Free = false;
	private char symbol;
	private boolean difficulty = false; //true == easy, false == hard
	playfield pl;
	Random rand = new Random();
	
	public bot(playfield pl, char c) {
		this.pl = pl;
		this.symbol = c;
		playfield = new char[3][3];
		history = new int[9][2];
		playermoves = new int[5][2];
		
		for(int i = 0; i < playermoves.length; i++) {
			playermoves[i][0] = 9;
		}
		
		nextMove = new int[2];
		fillWinMoves();
		System.out.println("___________________________________");
		System.out.println();
		System.out.println("-------------Bot ready-------------");
		System.out.println("___________________________________");
		System.out.println();
		
	}
	
	public void playerMove() {
		updateHistory();
		int[][] temp = new int[1][2];
		temp = pl.getRecentMove();
		playermoves[playermovecount][0] = temp[0][0];
		playermoves[playermovecount++][1] = temp[0][1];
		
	}
	
	public void setMove() {
		//When Bot can make first move, make it random
		if(pl.getmovecount() == 0 || difficulty) {
			do {
				x = rand.nextInt(3);
				y = rand.nextInt(3);
				if(pl.isFree(y, x)) {Free = pl.setMove(y, x, symbol);}
			}while(!Free);
			Free = false;
			System.out.println("Calculated move: " + y + " | " + x);
			}
		
		else {
			
			playerMove();
			if(isPlayerWin() && !difficulty) {
					Free = pl.setMove(nextMove[0], nextMove[1], this.symbol);		
				}
			
			else {
				do {
					x = rand.nextInt(3);
					y = rand.nextInt(3);
					if(pl.isFree(y, x)) {Free = pl.setMove(y, x, symbol);}
				}while(!Free);
				Free = false;
				System.out.println("Calculated move: " + y + " | " + x);
				}
			}
		}
		
	
	
	private void updatePlayfield() {
		playfield = pl.getField();
	}
	
	private void updateHistory() {
		history = pl.getHistory();
	}
	
	private boolean isPlayerWin() {
		int isSolution = 0;
		if(playermovecount > 1) {
			updatePlayfield();
			//Solution 1
			if(playfield[0][0] == 'X') {isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 0;
			}
			if(playfield[1][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 1;
			}
			if(playfield[2][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 2;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			//Solution 2
			if(playfield[0][0] == 'X') {isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 0;
			}
			if(playfield[0][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 1;
			}
			if(playfield[0][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 2;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			
			//Solution 3
			if(playfield[0][0] == 'X') {isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 0;
			}
			if(playfield[1][0] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 0;
			}
			if(playfield[2][0] == 'X'){isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 0;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			//Solution 4
			if(playfield[1][0] == 'X') {isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 0;
			}
			if(playfield[1][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 1;
			}
			if(playfield[1][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 2;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			
			//Solution 5
			if(playfield[2][0] == 'X') {isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 0;
			}
			if(playfield[2][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 1;
			}
			if(playfield[2][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 2;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			
			//Solution 6
			if(playfield[2][0] == 'X') {isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 0;
			}
			if(playfield[1][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 1;
			}
			if(playfield[0][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 2;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			
			//Solution 7
			if(playfield[0][2] == 'X') {isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 2;
			}
			if(playfield[1][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 2;
			}
			if(playfield[2][2] == 'X'){isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 2;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
			//Solution 7
			if(playfield[0][1] == 'X') {isSolution++;}
			else {
				nextMove[0] = 0;
				nextMove[1] = 1;
			}
			if(playfield[1][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 1;
				nextMove[1] = 1;
			}
			if(playfield[2][1] == 'X'){isSolution++;}
			else {
				nextMove[0] = 2;
				nextMove[1] = 1;
			}
			if(isSolution == 2 && pl.isFree(nextMove[0], nextMove[1])) {
				System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
				return true;
			}
			else {
				isSolution = 0;
			}
			
		}	
		return false;
	}
	private boolean isEqualWinPosition(int a) {
		for(int i : solutionPosition) {
			if(i == a) {
				return true;
			}
		}
		return false;
	}
	
	public String getBotname() {
		botNames = new String[10];
		
		botNames[0] = "Jaeggi";
		botNames[2] = "Sebastian";
		botNames[3] = "Desiree";
		botNames[4] = "Florian";
		botNames[5] = "Micha";
		botNames[6] = "Max";
		botNames[7] = "Alan";
		botNames[8] = "Leon";
		botNames[9] = "Jenny";
		
		x = rand.nextInt(10);
		
		return botNames[x];
	}
	
	public void setDifficulty(boolean a) {
		this.difficulty = a;
	}

	private void fillWinMoves() {
		winPositions = new int[24][2];
		solutionPosition = new int[8];
		
		//Solution index
		solutionPosition[0] = 3;
		solutionPosition[1] = 6;
		solutionPosition[2] = 9;
		solutionPosition[3] = 12;
		solutionPosition[4] = 15;
		solutionPosition[5] = 18;
		solutionPosition[6] = 21;


		
		//Make Winposition number
		/* int j = 1;
		for(int i = 0; i < winPositions.length; i++) {
			winPositions[i][0] = j;
			if(i % 3 == 0) {
				j++;
			}
		}
		*/
		
		//There has to be a better way to save the positions...
		//1
		winPositions[0][0] = 0;
		winPositions[0][1] = 0;
		winPositions[1][0] = 1;
		winPositions[1][1] = 1;
		winPositions[2][0] = 2;
		winPositions[2][1] = 2;
		//2
		winPositions[3][0] = 0;
		winPositions[3][1] = 0;
		winPositions[4][0] = 0;
		winPositions[4][1] = 1;
		winPositions[5][0] = 0;
		winPositions[5][1] = 2;
		//3
		winPositions[6][0] = 0;
		winPositions[6][1] = 0;
		winPositions[7][0] = 1;
		winPositions[7][1] = 0;
		winPositions[8][0] = 2;
		winPositions[8][1] = 0;
		//4
		winPositions[9][0] = 1;
		winPositions[9][1] = 0;
		winPositions[10][0] = 1;
		winPositions[10][1] = 1;
		winPositions[11][0] = 1;
		winPositions[11][1] = 2;
		//5
		winPositions[12][0] = 2;
		winPositions[12][1] = 0;
		winPositions[13][0] = 2;
		winPositions[13][1] = 1;
		winPositions[14][0] = 2;
		winPositions[14][1] = 2;
		//6
		winPositions[15][0] = 2;
		winPositions[15][1] = 0;
		winPositions[16][0] = 1;
		winPositions[16][1] = 1;
		winPositions[17][0] = 0;
		winPositions[17][1] = 2;
		//7
		winPositions[18][0] = 0;
		winPositions[18][1] = 2;
		winPositions[19][0] = 1;
		winPositions[19][1] = 2;
		winPositions[20][0] = 2;
		winPositions[20][1] = 2;
		//8
		winPositions[21][0] = 0;
		winPositions[21][1] = 1;
		winPositions[22][0] = 1;
		winPositions[22][1] = 1;
		winPositions[23][0] = 2;
		winPositions[23][1] = 1;
	}
	
	public int[][] getWinPositions(){
		return winPositions;
	}
}


/* Old Move Mechanic
  

public void setMove() {
do {
	x = rand.nextInt(3);
	y = rand.nextInt(3);
	Free = pl.setMove(y, x, symbol);
}while(!Free);
Free = false;
}


Old code:

				temp[0] = playermoves[i][0];
				temp[1] = playermoves[i][1];
				System.out.println("-------------------------");
				System.out.println("Analyzing playermove: " + temp[0] + " | " + temp[1]);
				System.out.println("-------------------------");
				
				equalcount = 0;
				notequalcount = 0;
				solutioncount = 0;

				//I don't know what the FUCK is happening here, but I'm close solving it...
				for(int j = 0 ; j < winPositions.length; j++) {
					
					
					
					if(winPositions[j][0] == temp[0] && winPositions[j][1] == temp[1]) {
						System.out.println("Player played: " + winPositions[j][0] + " | " + winPositions[j][1]);
						equalcount++;

					}
					
					else if(solutioncount == 2 && winPositions[j][0] != temp[0] && winPositions[j][1] != temp[1]) {
						nextMove[0] = winPositions[j][0];
						nextMove[1] = winPositions[j][1];

						System.out.println("Player did not played: " + winPositions[j][0] + " | " + winPositions[j][1]);
						notequalcount++;

						}
					
					solutioncount++;
					
					System.out.println("-------------------------");
					System.out.println("Solutioncount: " + solutioncount);
					System.out.println("-------------------------");
					
					
					
					if(solutioncount == 3) {
						equalcount = 0;
						notequalcount = 0;
						solutioncount = 0;
					}
					
					if(pl.isFree(nextMove[0], nextMove[1])) {
						System.out.println("-------------------------");
						System.out.println("Recognized possible player win solution:");
						System.out.println("Calculated move: " + nextMove[0] + " | " + nextMove[1]);
						System.out.println("-------------------------");
						return true;
					}
					
				}
				
					
*/