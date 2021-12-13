package Map;
import Utilities.Terminal;

public class Tile_Place extends Tile{
	int PlayerInput = 0;
	boolean foundItems = false;
	String TownName;
	public Tile_Place(int Area, int Temperature, String name) {
		super.Area = Area;
		super.Temperature = Temperature;
		super.ArtOfTile = 0;
		super.SortOfTile = "Place";
		this.TownName = name;
	}
	@Override
	public void print() {
		System.out.println("________________________________________________________________________________________________________");
		System.out.println("                                                                                                    \r\n" + 
				"                                                                                                    \r\n" + 
				"                                                     ..                                             \r\n" + 
				"                                                    ***                                             \r\n" + 
				"                                                     #(                                             \r\n" + 
				"                                                    (((/                                            \r\n" + 
				"                                                 /((/((#/                                           \r\n" + 
				"                                          ......,.,,,,.,,,@@@.                                      \r\n" + 
				"                                           &&(////(#***#(#///%@@                                    \r\n" + 
				"                                            ,(#@@@(*,@@@*(***(*                                     \r\n" + 
				"                                           /*/*@@@(,*@@@/**,*,*(      ,*                            \r\n" + 
				"                        *,,  ,,,,(        /**,/&@@(**@@@(//,*,,(*     **/                           \r\n" + 
				"                        /,.,,#@#@,@,,.(.##%%**/&@@/,,@&#/*/.*,/##     */..*(                        \r\n" + 
				"                     ,,,%@((#**##(@&&@@&,,/%/**,*//,,,**/****//,######***(( (                       \r\n" + 
				"                 ,,.*/%&((*/((/**//(((/(%@&@,*****/(**,,*,/,*,,((((((#(#(#.#(.                      \r\n" + 
				"                     /*/((*,,**&&#,*///*(/*@#///(*@@@&*//,*,.//*@@@@@@*%****#(                      \r\n" + 
				"                     **,**/&&/#%&%*#@**,*,***/**/,@@@@***//,,*,/(*@@%*/(*/#*,,,                     \r\n" + 
				"                     /**,*,&&//&@@,#@*//**,*/**/(*@@@@,,,,,.**,*/*@@#,,*,,,/**,                     \r\n" + 
				"                     ,,*//*@@,#@@@/%@***,,,,**/(#*@@@@/**//*,,**/*@@#,**,**,,,,                     \r\n" + 
				"                     *,****(((##((#(#*.***/###(####(//*,,...,*##((((/*,*..,,,,,                     \r\n" + 
				"                     //%%&(////#*.,,,#/(#%*(@@@@@@@@@@@@#*/(###@@@%#/%@%,,*,*,,                     \r\n" + 
				"                     */(#&/,@@@@,.@@@.*/*(/*##%#%@@@@@@(#*/**#%%%#%,#//(.#,,,.,                     \r\n" + 
				"                     (((#%/,@@&@,.@&@.////,(*((((#(/&(@((./**/#(((#,#&*/.**,,,,                     \r\n" + 
				"                     ///(#/,@@@@,.&&&./**/,*//((/(#(@(&(/,//*///(/&,(%,*.,*,,,*                     \r\n" + 
				"                    .(/((%/,&&&&, &&&.***/,**///*(***/***,/,*///(*/,/#,*,,*,,,,                     \r\n" + 
				"                    ,*//(#*,,,,,,...,,/((*,***//*(*/*//**,,******,..*,.,,***,,,                     \r\n" + 
				"                    (/(/(#/,*//**,,,.*/((*((,,*(((((#,****,***,**,,,**,,,,.,**,                     \r\n" + 
				"                    /*////**///(,.,,,,//(/*,,((((((#*,,,**,,,*,,,.,...,,,,**,*,                     \r\n" + 
				"               .........,,,,,,,,*,,,**//((/*((((((((,*/*/**/*/**//*,.......................");
		System.out.println("You enter the town of " + TownName + ", what do you want to do?");
		System.out.println("[1] Go to the trader \r\n"
				+ "[2] Search for a quest \r\n"
				+ "[3] Go to the tavern \r\n"
				+ "[4] leave the town (Moves you to Map)");
		do {
			try {
				PlayerInput = Terminal.readInt();
			}catch(NumberFormatException ex){
				System.out.println("[1] Go to the trader \r\n"
						+ "[2] Search for a quest \r\n"
						+ "[3] Go to the tavern"
						+ "[3] leave the town (Moves you to Map)");
			}
		}while(PlayerInput >= 4);
		//-----------------------------------------------------------------------------------
		if(PlayerInput == 1) {
			System.out.println("You walk to the markets and stroll thorugh the different wares.");
			System.out.println("What do you want to buy?"
					+ "		 0: Water\r\n" + 
					"		 1: Food\r\n" + 
					"		 2: Mug\r\n" + 
					"		 3: Arrow\r\n" + 
					"		 4: Bow\r\n" + 
					"		 5: Sword\r\n" + 
					"		 6: Shield\r\n" + 
					"		 7: Cloth\r\n" + 
					"		 8: Helmet\r\n" + 
					"		 9: Shoes");
			System.out.println("Type your choice: ");
			do {
				try {
					PlayerInput = Terminal.readInt();
				}catch(NumberFormatException ex){
					System.out.println("Use the numbers that ar shown at the list.");
				}
			}while(PlayerInput >= 10);
			
			System.out.println("Type amount:");
			try {
				PlayerInput = Terminal.readInt();
			}catch(NumberFormatException ex){
				System.out.println("Use numbers.");
			}while(PlayerInput >= 100);
			//TODO Buy items
		}
		
		//-----------------------------------------------------------------------------------	
	else if(PlayerInput == 2) {
		//TODO Quest
		System.out.println("TODO Quests");
		
	}
		//-----------------------------------------------------------------------------------
	else if(PlayerInput == 3) {
		System.out.println("                                . .                                                               \r\n" + 
				"                          .......................,....                                              \r\n" + 
				"                 .................................,.........                                        \r\n" + 
				"            . ..   . . ..........,,,,,,,,,,,,,,,,,,,,.,.............                                \r\n" + 
				"          ..         . .. ....,,,,,,,,,,*,****,*,,,,,,,,.,,...........                              \r\n" + 
				"         .................,,,,,,*********///////*////******//****/****                              \r\n" + 
				"        .... .        .....,,,,,,,,,***********,***,,,,,.......,,,,,**,                             \r\n" + 
				"        ......          ........,,,,****************,,,,........,,**,*,                             \r\n" + 
				"        .....         .....,..,.,,,,*,***/******,*,,*,,,,,......,,,,,,,                             \r\n" + 
				"        .,......       .,....,,,,,,/****////(/////////((/#(#((#/####%#/                             \r\n" + 
				"        ##(//*,,,,..,,,,,,,*************,,**,,,,,,,,,,,,,,,,,,,,,,**((*                             \r\n" + 
				"        (#(//*,,,,..,,,,,,,*************,,,,,,,,,,,,,,,,,,,,,,,,,,**((,                             \r\n" + 
				"        ,#(//*,,,,..,,,,,,,*********,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*((,                             \r\n" + 
				"         #(//,,,.,..,,,,,,,**,**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*/#*    .*,,,,,,*,               \r\n" + 
				"         ((//,,,,,..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*/#/%*,,,,,,,,,,,,,..            \r\n" + 
				"         ((//,,,,,..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*(*% ..,*//////*,,*,. *         \r\n" + 
				"         ((/*,,,,,...,,,,,,,,,,,,,,,,,,,**,,,,,,,,,,,,,,,,,,,,,,.,,.*(*%..,/        *,.**,          \r\n" + 
				"         (#//*,,,....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,....,,,*/%%**            ..,/*  .      \r\n" + 
				"         ##/*,,,,....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,.......,,,*/%%/(             ..*/*        \r\n" + 
				"         ##/*,,,,....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..........,,*/#%*               ..*/*       \r\n" + 
				"         ##/*,,,,....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...........,,*/#                 ...//,      \r\n" + 
				"         ##/*,,,,.....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,..........,,*(#                  ..*//  .   \r\n" + 
				"         #(/*,,,,.....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...,,..........,,(#                  ...//*     \r\n" + 
				"         #(/*,,,,.....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,............,,*(#                   . ,//  ,  \r\n" + 
				"         ((/*,,,,.....,,,,,,,,,,,,,,,,,,,,,,,,,,.,.,...............,*(#                   ,..//,    \r\n" + 
				"         ((/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,,,,................,,/#                   ,..*/*    \r\n" + 
				"         ((/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,.,.................,,/#                   ,. ,**  , \r\n" + 
				"         ((/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,.,,................,,*#                    . ,**  . \r\n" + 
				"         ((/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,,,,................,,/(                    . ,**  . \r\n" + 
				"         #(/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,.,,................,,//                    ..,*,  . \r\n" + 
				"         #(/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,,,,................,,//                   ,..**,  , \r\n" + 
				"         #(/*,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..............,,//                   ..***.  . \r\n" + 
				"         #(/*,,,.....,,,,..,,,,,,,,,,,,,,,,,,,,,,,,,,,,......,.....,,//                  ,..,*,  *  \r\n" + 
				"         ((/*,,,,,...,..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,........,,,//                 ,.,,*,. ,   \r\n" + 
				"         ((/*,,,,....,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...,......,,*//               ,,,***,..,    \r\n" + 
				"         ((/*,,,,,,..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,......,,,*/*              *,,**,...*     \r\n" + 
				"         ((/**,,,,...,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.....,,,*/*           ./****,,..,*      \r\n" + 
				"         ((/**,,,,...,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,/(%/(#/  /(/****,,..,,*        \r\n" + 
				"         (#/**,,,,...,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,(%.///(//***,,,...,,/          \r\n" + 
				"         (#/**,,,,...,,,,,,,,,,,,,,,,,,,**,,,,,,,,,,,,,,,,,,,,,,,,,**(%/,,,,,,,,...,,,*/            \r\n" + 
				"         #%(/*,,,,,..,,,,,,*****,****,,,,,,,*,,,,,,,,,,,,,,,,,,,,**///% ,....,,,,,**(               \r\n" + 
				"         %%#(/**,,,..,,,,,*************************************//((*,(%&******///                   \r\n" + 
				"         %&&%##(/*,,,*****////////////////////////(((((((((###%/(#%#%*,%////,                       \r\n" + 
				"        ###%%#(((/*,/////(((############((##########%%%%%%%#((//*,.   ,,*                           \r\n" + 
				"       /%(#(,.........,,,,,,,,,,*//((((####((/,...,,,,,.,.,,,***. , /((%#.                          \r\n" + 
				"      *##*,//,(#(/,  .......,,,,,,,,,,,,,,,,,,,,,,,,.,,..,/%%%%,    .,/(%#*                         \r\n" + 
				"     ,#%/*,...            .,/(#%%%%%%%%%%%&%%%%##/,                 ..*/%(#/                        \r\n" + 
				"     #%#**,....                                                     ..*/(&*(.                       \r\n" + 
				"     /%%/*,....                                                    ...//#%,                         \r\n" + 
				"         #,/,,,...  . .                                        ../.                                 \r\n" + 
				"                      .*/*...,,***********////**,*/(,     ");
		System.out.println("YOu walk into the tavern and order a beer. You listen at the new roumors and drink.");
	}
		//-----------------------------------------------------------------------------------
	else {
		System.out.println("________________________________________________________________________________________________________");
	}
	
	}
	@Override
	public String TileString() {
		return SortOfTile;
	}
}