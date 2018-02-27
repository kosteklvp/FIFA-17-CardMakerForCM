package gui;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Final_values {

	public static final Font font_BOLD = new Font("SansSerif", Font.BOLD, 16);
	public static final Font font_PLAIN = new Font("SansSerif", Font.PLAIN, 12);
	public static final String tooltip = new String("Podaj wartoœæ od 1 do 99");
	
	
	public static void setFontForWholeJFrame() {
		
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while(keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			
			if(value instanceof FontUIResource)				//instanceof sprawdzanie typu
				UIManager.put(key, Final_values.font_BOLD);
		}
	}
	

}
