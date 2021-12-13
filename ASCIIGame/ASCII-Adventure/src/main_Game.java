import Creatures.*;
import Map.*;
import Utilities.Terminal;

public class main_Game {

	public static void main(String[] args) {
		int PlayerInput = 10;
		int MoveX, MoveY;
		Object ActualTile;
		System.out.println("    ,---.       ,-,--.   _,.----.   .=-.-..=-.-.          ,---.                        ,-.-.    ,----. .-._        ,--.--------.                             ,----.  \r\n" + 
				" .--.'  \\    ,-.'-  _\\.' .' -   \\ /==/_ /==/_ /        .--.'  \\     _,..---._  ,--.-./=/ ,/ ,-.--` , /==/ \\  .-._/==/,  -   , -\\.--.-. .-.-. .-.,.---.   ,-.--` , \\ \r\n" + 
				" \\==\\-/\\ \\  /==/_ ,_./==/  ,  ,-'|==|, |==|, |         \\==\\-/\\ \\  /==/,   -  \\/==/, ||=| -||==|-  _.-|==|, \\/ /, \\==\\.-.  - ,-./==/ -|/=/  |/==/  `   \\ |==|-  _.-` \r\n" + 
				" /==/-|_\\ | \\==\\  \\  |==|-   |  .|==|  |==|  |         /==/-|_\\ | |==|   _   _\\==\\,  \\ / ,||==|   `.-|==|-  \\|  | `--`\\==\\- \\  |==| ,||=| -|==|-, .=., ||==|   `.-. \r\n" + 
				" \\==\\,   - \\ \\==\\ -\\ |==|_   `-' |==|- |==|- |         \\==\\,   - \\|==|  .=.   |\\==\\ - ' - /==/_ ,    |==| ,  | -|      \\==\\_ \\ |==|- | =/  |==|   '='  /==/_ ,    / \r\n" + 
				" /==/ -   ,| _\\==\\ ,\\|==|   _  , |==| ,|==| ,|         /==/ -   ,||==|,|   | -| \\==\\ ,   ||==|    .-'|==| -   _ |      |==|- | |==|,  \\/ - |==|- ,   .'|==|    .-'  \r\n" + 
				"/==/-  /\\ - /==/\\/ _ \\==\\.       |==|- |==|- |        /==/-  /\\ - |==|  '='   / |==| -  ,/|==|_  ,`-.|==|  /\\ , |      |==|, | |==|-   ,   |==|_  . ,'.|==|_  ,`-._ \r\n" + 
				"\\==\\ _.\\=\\.-\\==\\ - , /`-.`.___.-'/==/. /==/. /        \\==\\ _.\\=\\.-|==|-,   _`/  \\==\\  _ / /==/ ,     /==/, | |- |      /==/ -/ /==/ , _  .'/==/  /\\ ,  /==/ ,     / \r\n" + 
				" `--`        `--`---'            `--`-``--`-`          `--`       `-.`.____.'    `--`--'  `--`-----```--`./  `--`      `--`--` `--`..---'  `--`-`--`--'`--`-----`` ");

		
		Map m1 = new Map();
		m1.fillMap();
		Player p = new Player("Sebastian", 1.8, 24);
		testCreature c1 = new testCreature("Troll", 1.5, 3);
		
		p.getPlayerInfo();
	
		System.out.println("The moment you walked out of the taverne you get attacked by a Troll!");
	System.out.println("____________________________");
	System.out.println("  ______ _       _     _   _ \r\n" + 
			" |  ____(_)     | |   | | | |\r\n" + 
			" | |__   _  __ _| |__ | |_| |\r\n" + 
			" |  __| | |/ _` | '_ \\| __| |\r\n" + 
			" | |    | | (_| | | | | |_|_|\r\n" + 
			" |_|    |_|\\__, |_| |_|\\__(_)\r\n" + 
			"            __/ |            \r\n" + 
			"           |___/    ");
	System.out.println("____________________________");
	
	while(!c1.isDead() && !p.isDead()){
			
			c1.inflictDamage(p.Attack());
			p.inflictDamage(c1.Attack());
			
			System.out.println("Troll: " + c1.getHealth() + " | " + "Player: " + p.getHealth());
			
			System.out.println("-----------------------------");
			
		}
		
		if(c1.isDead()) {
			System.out.println("Player killed Troll");
		}
		else {
			System.out.println("Player got killed by Toll");
		}
		
		m1.printMap();
		
		m1.move(1, 1);
		
		m1.printMap();
		
		System.out.println("Choos next tile:");
		System.out.println("Insert X: ");
		do {
			System.out.println("Insert number (0-2)");
			try {
				PlayerInput = Terminal.readInt();
			}catch(NumberFormatException ex) {
			    System.out.println("Use numbers 0-3:");
			}
		}while(PlayerInput >= 3);
		
		MoveX = PlayerInput;
		
		System.out.println("Insert y: ");
		do {
			System.out.println("Insert number (0-2)");
			try {
				PlayerInput = Terminal.readInt();
			}catch(NumberFormatException ex) {
			    System.out.println("Use numbers 0-3:");
			}
		}while(PlayerInput >= 3);
		
		
		MoveY = PlayerInput;
		
		
		m1.move(MoveX, MoveY);
		
m1.printMap();
		
		System.out.println("Choos next tile:");
		System.out.println("Insert X: ");
		do {
			System.out.println("Insert number (0-2)");
			try {
				PlayerInput = Terminal.readInt();
			}catch(NumberFormatException ex) {
			    System.out.println("Use numbers 0-2:");
			}
		}while(PlayerInput >= 3);
		
		MoveX = PlayerInput;
		
		System.out.println("Insert y: ");
		do {
			System.out.println("Insert number (0-2)");
			try {
				PlayerInput = Terminal.readInt();
			}catch(NumberFormatException ex) {
			    System.out.println("Use numbers 0-2:");
			}
		}while(PlayerInput >= 3);
		
		
		MoveY = PlayerInput;
		
		
		m1.move(MoveX, MoveY);
		
		
		}
		
	}


