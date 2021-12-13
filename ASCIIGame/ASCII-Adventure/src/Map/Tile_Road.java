package Map;
import Utilities.*;
public class Tile_Road extends Tile{
	int PlayerInput = 0;
	boolean foundItems = false;
	public Tile_Road(int Area, int Temperature) {
		super.Area = Area;
		super.Temperature = Temperature;
		super.ArtOfTile = 0;
		super.SortOfTile = "Road";
	}
	@Override
	public void print() {
		System.out.println("________________________________________________________________________________________________________");
		System.out.println("                                                                                     %((*/(**///(#&&\r\n" + 
				"                                                                                ##**(%%#(/*////((//#\r\n" + 
				"                                                                          *(/**(*//*/#/,.,,,(&%(////\r\n" + 
				"                                                                    ****,,/#/(((/*,*,(&%&&%//(*/###(\r\n" + 
				"                                                               .(***(,,*.%&//,*,*&&%*,**#(((///(&@#(\r\n" + 
				"                                                         #%%%(((///&(/***,**//*/..,,&&/#**/#(%@%(/*,\r\n" + 
				"                                                  .&///*,(%/*(.,,,#//***/**&%*,,,,**/&#////@@%(/,.  \r\n" + 
				"                                            /.%#(**,,.#,,////*#&/**/*,**&%,,.,,,,(//((%*@&#((*,.    \r\n" + 
				"                                      *(*/*/**&@(//,,,,,&&****/,,&#*#%*,,*,%&*,*,*(*(&#%(/*,.       \r\n" + 
				"                                (((((/@#,,,,,,*,.(,*,,*,,*&.,,.,,,*@&%*,*,/*/@&%///%&#(/,.          \r\n" + 
				"                          .%%/###(//%@****,,**#&&**.*,/.,,%,,,.(%**#&&/**,,,**,&%@%(/*,.            \r\n" + 
				"                    ,##@&(/*//,**#&&(#,,#*/&&&%*(,.,,,,*&&#,,,*,*,.,#,.,**(/#@%%#(*,.               \r\n" + 
				"             ,&%%(*#@((/#(#((/@&%/*,,*,**@&#//*#*/**&&&(**,**,,,%&&(***,*%&#&#(/,.                  \r\n" + 
				"        *(#(%@@((///****/@@(/((/(///*&((**,/,,,,&&(//(/*,**,*@@#*((//**%%%#(/*,.                    \r\n" + 
				"  %%%#(@&/(/,/*///@&(*/((*/**,&&@//*,//*((/@&&*//*/*,,,@#&***/***%(/,@#%(/*,.                       \r\n" + 
				"%###%#(((*/*@#*//(//***(@&*(#(/(***,,@&///***/@*/**@(*(/,**..*,&&&&#&#(*,.                          \r\n" + 
				"#(#@@((//((//(//*@&/*///*(***&(#/*/*,*,**,,%&(*///*#/*(*/*&%////(&#((*,.                            \r\n" + 
				"#((#(##@&//(///(//*//(@&/**/((****&%&/**(//**,,*,&&(/*(#%###&@%#(/*,.                               \r\n" + 
				"((#*#*/((/#(@@(////////***@&%/(*,**,/,*&&%((**///(,*//*%@&&@@#(*,.                                  \r\n" + 
				"&%(#(((/((//(/#(@@//(/****,*/*,&&&///(//,*,*&%%&#/((/%&&&@%(/*..                                    \r\n" + 
				"(%(@&%(((((*////(*//@@#//*/**/***/**@%&/%*(*/,**,*&&&&%%#/*,.                                       \r\n" + 
				"(((####@&#(#((/****(*///(@&/***/,**//*/(/@@&%&%(*@%%%((*,.                                          \r\n" + 
				"((%/((###(@&&##((((/*((///**/@@#//*,*/***(((//&%#%#(*,.                                             \r\n" + 
				"#####(/*//(((#(&@##((/(//**/(*,%,(((**//*,*%%#@%(/*,.                                               \r\n" + 
				"@@%##((#(##/%@(/,,@&&(###((/*//*,*%*,(@&@*#(#(/*,.                                                  \r\n" + 
				"%%%@@@#/((((////*//((@@&&/(((#(%((#(%%#%@#(**,.                                                     \r\n" + 
				"((((#(&@@(((((/(#/(//*(//@@&&((#&#%%&/#(/,.. ");
		
		System.out.println("You walk on the road.");
		System.out.println("________________________________________________________________________________________________________");
	}
	@Override
	public String TileString() {
		return SortOfTile+" ";
	}
}