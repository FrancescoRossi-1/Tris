package constants;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
	
	public class Modalita {
		
		public static final String GIOCATORE_SINGOLO = "Giocatore Singolo";
		public static final String MULTIGIOCATORE = "Multigiocatore";
		
	}

	public static class MenuButtons {
		
		public static final List <String> MENU_BUTTONS = new ArrayList<>(Arrays.asList("Giocatore Singolo","Multigiocatore"));
		
	}
	
	public class MenuText {
		
		public static final String MENU_TRIS = "Menù tris";
		public static final String TITOLO = "Tris";
		
	}
	
	public static class Fonts {
		
		public static Font SANS_SERIF = new Font("SansSerif", Font.BOLD, 30);
		
	}

}
