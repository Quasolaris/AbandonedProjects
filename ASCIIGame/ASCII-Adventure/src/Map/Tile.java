package Map;

public abstract class Tile extends Map{
	int Area = 0, Temperature = 0;
	protected String SortOfTile;
	protected int ArtOfTile;
	protected String[] TileList = new String[5];
	
	
	/*
	 * Arts of Tiles
	 * 0: Woods
	 * 1: Desert
	 * 2: Grassland
	 * 3: Bar
	 * 4: Castle
	 */
	
	public void fillTiles() {
		TileList[0] = "Woods";
		TileList[1] = "Desert";
		TileList[2] = "Grassland";
		TileList[3] = "Bar";
		TileList[4] = "Castle";
	}
	public String TileString() {
		return SortOfTile;
	}
	
	public void print() {
		
	}
}
