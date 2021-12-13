public class main_ASCII {
	
	public static void main(String[] args) {
		LitEngine.debugShowPressedKeys();

        // To set resolution, use LitEngine.setRes(x,y) before you start the engine.
        LitEngine.setRes(200, 50);
        LitEngine.setTitle("ASCII Game");
        try {
			LitEngine.start("border");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
