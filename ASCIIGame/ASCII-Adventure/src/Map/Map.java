package Map;

public class Map {
	protected Object[][] Map = new Object[3][3];
	protected Tile Tile1;
	protected int ActualX, ActualY;
	Tile_Place p2;
	Tile_Place p1;
	Tile_Road r1;
	Tile_Woods t1;
	
	protected String Name = "Kingdom of ASCII";
	
	public void move(int x, int y) {
		ActualX = x;
		ActualY = y;
		Tile1 = (Tile) Map[ActualY][ActualX]; 
		Tile1.print();	
	
			
		}
	
	
	public Tile getTile() {
		return (Tile) Tile1;
	}
	
	public void fillMap() {		
		t1 = new Tile_Woods(12, 23);
		r1 = new Tile_Road(10, 20);
		p1 = new Tile_Place(40, 22, "Kingsbridge");
		p2 = new Tile_Place(40, 22, "Castletown");
		Map[0][0] = t1;
		Map[0][1] = r1;
		Map[0][2] = p2;
		Map[1][0] = t1;
		Map[1][1] = p1;
		Map[1][2] = r1;
		Map[2][0] = t1;
		Map[2][1] = t1;
		Map[2][2] = t1;

	}
	
	public void printMap() {
		
		for(int i = 0; i < Map.length; i++) {
			System.out.println();
			for(int j = 0; j < Map[0].length; j++) {
				System.out.print(((Tile) Map[i][j]).TileString() + "  |  ");
			}
			System.out.println();
		}
	}
}
