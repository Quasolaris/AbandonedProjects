package TicTacToe;

public class playfield {
	//---------------------Attributes--------------------------------
	private char[][] playfield;
	private int[][] history;
	private int movecount = 0;
	
	//---------------------Constructors--------------------------------
	public playfield() {
		playfield = new char[3][3];
		history = new int[9][3];
		for(int i = 0; i < playfield.length; i++) {
			for(int j = 0; j < playfield[0].length; j++) {
				playfield[i][j] = ' ';
			}
		}
	}
	
	
	//---------------------Methods--------------------------------
	public void printPlayfield() {
		for(int i = 0; i < playfield.length; i++) {
			System.out.println();
			System.out.println();
			System.out.print(i + "| ");
			for(int j = 0; j < playfield[0].length; j++) {
				System.out.print(playfield[i][j] + " | ");
			}
		}
		System.out.println();
		System.out.println("   0   1   2");
	}
	
	public void printHistory() {
		System.out.println("Move History: ");
		System.out.println("   Y  X");
		for(int i = 0; i < history.length; i++) {
			System.out.println(i + ": " + history[i][1] + "  " + history[i][2]);
			}
	}
	
	public boolean setMove(int a, int b, char c) {
		if(isFree(a,b)) {
			playfield[a][b] = c;
			
			
			//What Player made move
			if(c == 'X') {
				history[movecount][0] = 1;
			}
			else {
				history[movecount][0] = 0;
			}
			
			//Save move YX
			history[movecount][1] = a;
			history[movecount][2] = b;
			
			movecount++;
			
			return true;
		}
		
		else {
			System.out.println("Move not possible: Already used");
			return false;
		}
	}
	
	public void cleanField() {
		for(int i = 0; i < playfield.length; i++) {
			for(int j = 0; j < playfield[0].length; j++) {
				playfield[i][j] = ' ';
			}
		}
		movecount = 0;
	}
	
	public boolean isFree(int a, int b) {
		if(playfield[a][b] == ' ') {
			return true;
		}
		return false;
	}
	
	
	public boolean isFull() {
		if(movecount == 9) {
			return true;
		}
		return false;
	}
	
	//---------------------Game Over Test--------------------------------
	public boolean gameOver(char c) {
		if(playfield[0][0] == c && playfield[1][1] == c && playfield[2][2] == c) {
			return true;
		}
		if(playfield[0][0] == c && playfield[0][1] == c && playfield[0][2] == c) {
			return true;
		}
		if(playfield[1][0] == c && playfield[1][1] == c && playfield[1][2] == c) {
			return true;
		}
		if(playfield[2][0] == c && playfield[2][1] == c && playfield[2][2] == c) {
			return true;
		}
		if(playfield[2][0] == c && playfield[1][1] == c && playfield[0][2] == c) {
			return true;
		}
		if(playfield[0][2] == c && playfield[1][2] == c && playfield[2][2] == c) {
			return true;
		}
		if(playfield[0][1] == c && playfield[1][1] == c && playfield[2][1] == c) {
			return true;
		}
		if(playfield[0][0] == c && playfield[1][0] == c && playfield[2][0] == c) {
			return true;
		}
		return false;
	}
	
	//---------------------Getter--------------------------------
	
	public char[][] getField(){
		return playfield;
	}
	
	
	public int getmovecount() {
		return movecount;
	}
	
	public int[][] getHistory(){
		return history;
	}
	
	public int[][] getRecentMove(){
		int[][] temp = new int[1][2];
		
		temp[0][0] = history[movecount-1][1];
		temp[0][1] = history[movecount-1][2];
		
		return temp;
	}
	}
