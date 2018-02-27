package cardmaker;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import gui.Final_values;
import gui.Labels;
import gui.TextFields;
///////////////////////////////////////////////////////////
//
//dodac menu z opcja jeszcze nieaktualna opcja zapisu do pliku
//obliczanie na aktualnych pozycjach, kazda pozycja to nowy label, sprobowac dodac obrazek
///////////////////////////////////////////////////////////

public class MainJFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	
	public Labels labels;
	public TextFields textFields;
	
	private JButton button_calculate;
	private JButton button_test;
	
	private JMenuBar menuBar;
	private JMenu menu1;
	private JMenuItem menuReset;
	
	
	public Player player;
	
	
	
	// KONSTRUKTOR
	public MainJFrame() {

		
		setSize(1024, 960);
		setTitle("Fifa CM CardMaker");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Final_values.setFontForWholeJFrame();		
		
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
			
			menu1 = new JMenu("Opcje");
			menu1.setFont(Final_values.font_PLAIN);
			menuBar.add(menu1);
				
				menuReset = new JMenuItem("Reset");
				menuReset.setFont(Final_values.font_PLAIN);
				menu1.add(menuReset);
				menuReset.addActionListener(this);
				
			
			
			
		
		labels = new Labels();
		labels.addLabels(this);
		
		textFields = new TextFields();
		textFields.addTextFieldsAndComboBoxes(this);
		
		
		button_calculate = new JButton("Oblicz");
		button_calculate.setBounds(400,600,90,36);
		add(button_calculate);
		button_calculate.addActionListener(this);
		
		
		button_test = new JButton("Test");
		button_test.setBounds(400, 640, 90, 36);
		add(button_test);
		button_test.addActionListener(this);
		
		
	}
		
		
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source==button_calculate) {
			
			if(textFields.checkIfAllFieldsAreFilled()) {
				
			Toolkit sound = Toolkit.getDefaultToolkit();
			sound.beep();
			
			labels.lErrorEmptyField.setText("èLE PODANO WARTOåCI");
			button_calculate.setToolTipText("Pola nie mogπ byÊ puste");
			
			} else {	
				
			labels.lErrorEmptyField.setText(" ");
				
			player = new Player(this);
			labels.setAndDisplayResults(player);
			}
			
		}
		
		
		if(source==button_test) {
			textFields.setTextFieldsValuesRandomly();
		}
		
		if(source==menuReset) {
			textFields.setTextFieldsValuesEmpty();
		}
		

	}
	

	
	
	
	public static void main(String[] args) {
			
			
			MainJFrame application = new MainJFrame();
			application.setVisible(true);
			

	}
	
	
	
	

}


