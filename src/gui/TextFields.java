package gui;

import java.awt.TextField;
import java.text.ParseException;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import cardmaker.MainJFrame;

public class TextFields {
																						
	//zmienne
	private final int xPointStart = 186;
	private final int yPointStart = 1;
	
	private int xPoint = xPointStart;
	private int yPoint = yPointStart;

	private final int fieldWidth = 40;
	private final int fieldHeight = 24;
	
	
	MaskFormatter formatter = null;
	MaskFormatter formatter_height = null;
	String emptyJFormattedTextFieldValue = "  ";
	
																				
	
	
	//funkcje
	private int yShift() {
		return yPoint += 26;
	}

	private int yShiftSpace() {
		return yPoint += 50;
	}
	
	private int yShiftTwoSpaces() {
		return yPoint += 50 + 26;
	}
	
	private int yShiftToStartingPosition() {
		return yPoint = yPointStart + 26;
	}
	
	

	private void setTextField(JFormattedTextField textField, int x, int y, int width, int height) {
		textField.setBounds(x, y, width, height);
		textField.setHorizontalAlignment((int) TextField.CENTER_ALIGNMENT);

		if (textField.getFormatter() == formatter_height) {
			textField.setToolTipText("Podaj wartoœæ 100-250");
		} else {
			textField.setToolTipText("Podaj wartoœæ 10-99");
		}
	}
	
	private void setComboBox(JComboBox<String> comboBox, int x, int y, int width, int height, int choose_cb_option) {
		comboBox.setBounds(x, y, width, height);
		addComboBoxOptions(comboBox, choose_cb_option);
	}
	
	private void addComboBoxOptions(JComboBox<String> comboBox, int choose_cb_option) {
		
		if (choose_cb_option == 1) {
			comboBox.addItem("1");
			comboBox.addItem("2");
			comboBox.addItem("3");
			comboBox.addItem("4");
			comboBox.addItem("5");
		} else if (choose_cb_option == 2) {
			comboBox.addItem("L");
			comboBox.addItem("R");
		} else if (choose_cb_option == 3) {
			comboBox.addItem("W");
			comboBox.addItem("Œ");
			comboBox.addItem("N");
		}
	}
	
	
	private int generateRandomValue() {
		Random rand = new Random();
		return rand.nextInt(90) + 10;
	}
	
	
	
	//funkcje wywolywane w jframe
	public void setTextFieldsValuesRandomly() {
		
		t_acceleration.setValue(generateRandomValue());
		t_agility.setValue(generateRandomValue());
		t_jumping.setValue(generateRandomValue());
		t_strength.setValue(generateRandomValue());
		t_aggression.setValue(generateRandomValue());
		t_interceptions.setValue(generateRandomValue());
		t_vision.setValue(generateRandomValue());
		t_ball_control.setValue(generateRandomValue());
		t_dribbling.setValue(generateRandomValue());
		t_free_kick.setValue(generateRandomValue());
		t_long_passing.setValue(generateRandomValue());
		t_marking.setValue(generateRandomValue());
		t_long_shots.setValue(generateRandomValue());
		t_sliding_tackle.setValue(generateRandomValue());
		t_curve.setValue(generateRandomValue());
		t_sprint_speed.setValue(generateRandomValue());
		t_balance.setValue(generateRandomValue());
		t_stamina.setValue(generateRandomValue());
		t_reactions.setValue(generateRandomValue());
		t_composure.setValue(generateRandomValue());
		t_positioning.setValue(generateRandomValue());
		t_crossing.setValue(generateRandomValue());
		t_finishing.setValue(generateRandomValue());
		t_heading.setValue(generateRandomValue());
		t_short_passing.setValue(generateRandomValue());
		t_shot_power.setValue(generateRandomValue());
		t_standing_tackle.setValue(generateRandomValue());
		t_volleys.setValue(generateRandomValue());
		t_penalties.setValue(generateRandomValue());
		t_height.setValue(182);
		
	}
	
	public void setTextFieldsValuesEmpty() {
		
		t_acceleration.setValue(null);
		t_agility.setValue(null);
		t_jumping.setValue(null);
		t_strength.setValue(null);
		t_aggression.setValue(null);
		t_interceptions.setValue(null);
		t_vision.setValue(null);
		t_ball_control.setValue(null);
		t_dribbling.setValue(null);
		t_free_kick.setValue(null);
		t_long_passing.setValue(null);
		t_marking.setValue(null);
		t_long_shots.setValue(null);
		t_sliding_tackle.setValue(null);
		t_curve.setValue(null);
		t_sprint_speed.setValue(null);
		t_balance.setValue(null);
		t_stamina.setValue(null);
		t_reactions.setValue(null);
		t_composure.setValue(null);
		t_positioning.setValue(null);
		t_crossing.setValue(null);
		t_finishing.setValue(null);
		t_heading.setValue(null);
		t_short_passing.setValue(null);
		t_shot_power.setValue(null);
		t_standing_tackle.setValue(null);
		t_volleys.setValue(null);
		t_penalties.setValue(null);
		t_height.setValue(null);
		t_acceleration.requestFocusInWindow();	//ustawianie kursora
		
	}
	
	public boolean checkIfAllFieldsAreFilled() {
		if(	t_acceleration.getText().equals(emptyJFormattedTextFieldValue) ||
			t_agility.getText().equals(emptyJFormattedTextFieldValue) ||
			t_jumping.getText().equals(emptyJFormattedTextFieldValue) ||
			t_strength.getText().equals(emptyJFormattedTextFieldValue) ||
			t_aggression.getText().equals(emptyJFormattedTextFieldValue) ||
			t_interceptions.getText().equals(emptyJFormattedTextFieldValue) ||
			t_vision.getText().equals(emptyJFormattedTextFieldValue) ||
			t_ball_control.getText().equals(emptyJFormattedTextFieldValue) ||
			t_dribbling.getText().equals(emptyJFormattedTextFieldValue) ||
			t_free_kick.getText().equals(emptyJFormattedTextFieldValue) ||
			t_long_passing.getText().equals(emptyJFormattedTextFieldValue) ||
			t_marking.getText().equals(emptyJFormattedTextFieldValue) ||
			t_long_shots.getText().equals(emptyJFormattedTextFieldValue) ||
			t_sliding_tackle.getText().equals(emptyJFormattedTextFieldValue) ||
			t_curve.getText().equals(emptyJFormattedTextFieldValue) ||
			t_sprint_speed.getText().equals(emptyJFormattedTextFieldValue) ||
			t_balance.getText().equals(emptyJFormattedTextFieldValue) ||
			t_stamina.getText().equals(emptyJFormattedTextFieldValue) ||
			t_reactions.getText().equals(emptyJFormattedTextFieldValue) ||
			t_composure.getText().equals(emptyJFormattedTextFieldValue) ||
			t_positioning.getText().equals(emptyJFormattedTextFieldValue) ||
			t_crossing.getText().equals(emptyJFormattedTextFieldValue) ||
			t_finishing.getText().equals(emptyJFormattedTextFieldValue) ||
			t_heading.getText().equals(emptyJFormattedTextFieldValue) ||
			t_short_passing.getText().equals(emptyJFormattedTextFieldValue) ||
			t_shot_power.getText().equals(emptyJFormattedTextFieldValue) ||
			t_standing_tackle.getText().equals(emptyJFormattedTextFieldValue) ||
			t_volleys.getText().equals(emptyJFormattedTextFieldValue) ||
			t_penalties.getText().equals(emptyJFormattedTextFieldValue) ||
			t_height.getText().equals(emptyJFormattedTextFieldValue)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void addTextFieldsAndComboBoxes(MainJFrame currentFrame) {
		currentFrame.add(currentFrame.textFields.t_acceleration);
		currentFrame.add(currentFrame.textFields.t_agility);
		currentFrame.add(currentFrame.textFields.t_jumping);
		currentFrame.add(currentFrame.textFields.t_strength);
		currentFrame.add(currentFrame.textFields.t_aggression);
		currentFrame.add(currentFrame.textFields.t_interceptions);
		currentFrame.add(currentFrame.textFields.t_vision);
		currentFrame.add(currentFrame.textFields.t_ball_control);
		currentFrame.add(currentFrame.textFields.t_dribbling);
		currentFrame.add(currentFrame.textFields.t_free_kick);
		currentFrame.add(currentFrame.textFields.t_long_passing);
		currentFrame.add(currentFrame.textFields.t_marking);
		currentFrame.add(currentFrame.textFields.t_long_shots);
		currentFrame.add(currentFrame.textFields.t_sliding_tackle);
		currentFrame.add(currentFrame.textFields.t_curve);
		
		currentFrame.add(currentFrame.textFields.t_height);
		currentFrame.add(currentFrame.textFields.cb_skill_moves);
		currentFrame.add(currentFrame.textFields.cb_weak_foot);
		
		currentFrame.add(currentFrame.textFields.t_sprint_speed);
		currentFrame.add(currentFrame.textFields.t_balance);
		currentFrame.add(currentFrame.textFields.t_stamina);
		currentFrame.add(currentFrame.textFields.t_reactions);
		currentFrame.add(currentFrame.textFields.t_composure);
		currentFrame.add(currentFrame.textFields.t_positioning);
		currentFrame.add(currentFrame.textFields.t_crossing);
		currentFrame.add(currentFrame.textFields.t_finishing);
		currentFrame.add(currentFrame.textFields.t_heading);
		currentFrame.add(currentFrame.textFields.t_short_passing);
		currentFrame.add(currentFrame.textFields.t_shot_power);
		currentFrame.add(currentFrame.textFields.t_standing_tackle);
		currentFrame.add(currentFrame.textFields.t_volleys);
		currentFrame.add(currentFrame.textFields.t_penalties);
		
		currentFrame.add(currentFrame.textFields.cb_attack_workrate);
		currentFrame.add(currentFrame.textFields.cb_defensive_workrate);
		currentFrame.add(currentFrame.textFields.cb_strong_foot);
		
	}
	
	
	
	
	//KONSTRUKTOR
	public TextFields() {
		
		
		try {
			formatter = new MaskFormatter("##");
		} catch (ParseException e) { e.printStackTrace(); }
		
		try {
			formatter_height = new MaskFormatter("###");
		} catch (ParseException e) { e.printStackTrace(); }
		
		
		
		//LEWA KOLUMNA
		t_acceleration = new JFormattedTextField(formatter); 	
			setTextField(t_acceleration, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_agility = new JFormattedTextField(formatter);			
			setTextField(t_agility, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_jumping = new JFormattedTextField(formatter); 			
			setTextField(t_jumping, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_strength = new JFormattedTextField(formatter);			
			setTextField(t_strength, xPoint, yShift(), fieldWidth, fieldHeight);
			
		
		t_aggression = new JFormattedTextField(formatter);		
			setTextField(t_aggression, xPoint, yShiftSpace(), fieldWidth, fieldHeight);
			
		t_interceptions = new JFormattedTextField(formatter);	
			setTextField(t_interceptions, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_vision = new JFormattedTextField(formatter);			
		setTextField(t_vision, xPoint, yShift(), fieldWidth, fieldHeight);
			
		
		t_ball_control = new JFormattedTextField(formatter);		
			setTextField(t_ball_control, xPoint, yShiftSpace(), fieldWidth, fieldHeight);
			
		t_dribbling = new JFormattedTextField(formatter);		
			setTextField(t_dribbling, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_free_kick = new JFormattedTextField(formatter);		
			setTextField(t_free_kick, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_long_passing = new JFormattedTextField(formatter);		
			setTextField(t_long_passing, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_marking = new JFormattedTextField(formatter);			
			setTextField(t_marking, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_long_shots = new JFormattedTextField(formatter);		
			setTextField(t_long_shots, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_sliding_tackle = new JFormattedTextField(formatter);	
			setTextField(t_sliding_tackle, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_curve = new JFormattedTextField(formatter);			
			setTextField(t_curve, xPoint, yShift(), fieldWidth, fieldHeight);
			
		
		t_height = new JFormattedTextField(formatter_height);	
			setTextField(t_height, xPoint, yShiftSpace(), fieldWidth, fieldHeight);
			
		cb_weak_foot = new JComboBox<String>();					
			setComboBox(cb_weak_foot, xPoint, yShift(), fieldWidth, fieldHeight, 1);
			
		cb_skill_moves = new JComboBox<String>();				
			setComboBox(cb_skill_moves, xPoint, yShift(), fieldWidth, fieldHeight, 1);
			

		//PRAWA KOLUMNA
			xPoint+=264;
		
		t_sprint_speed = new JFormattedTextField(formatter);		
			setTextField(t_sprint_speed, xPoint, yShiftToStartingPosition(), fieldWidth, fieldHeight);
			
		t_balance = new JFormattedTextField(formatter);			
			setTextField(t_balance, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_stamina = new JFormattedTextField(formatter);			
			setTextField(t_stamina, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_reactions = new JFormattedTextField(formatter);		
			setTextField(t_reactions, xPoint, yShift(), fieldWidth, fieldHeight);
			

		t_composure = new JFormattedTextField(formatter);		
			setTextField(t_composure, xPoint, yShiftSpace(), fieldWidth, fieldHeight);
			
		t_positioning = new JFormattedTextField(formatter);		
			setTextField(t_positioning, xPoint, yShift(), fieldWidth, fieldHeight);
		
		
		t_crossing = new JFormattedTextField(formatter);			
			setTextField(t_crossing, xPoint, yShiftTwoSpaces(), fieldWidth, fieldHeight);
			
		t_finishing = new JFormattedTextField(formatter);		
			setTextField(t_finishing, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_heading = new JFormattedTextField(formatter);			
			setTextField(t_heading, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_short_passing = new JFormattedTextField(formatter);	
			setTextField(t_short_passing, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_shot_power = new JFormattedTextField(formatter);		
			setTextField(t_shot_power, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_standing_tackle = new JFormattedTextField(formatter);	
			setTextField(t_standing_tackle, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_volleys = new JFormattedTextField(formatter);			
			setTextField(t_volleys, xPoint, yShift(), fieldWidth, fieldHeight);
			
		t_penalties = new JFormattedTextField(formatter);		
			setTextField(t_penalties, xPoint, yShift(), fieldWidth, fieldHeight);
			

		cb_attack_workrate = new JComboBox<String>();			
			setComboBox(cb_attack_workrate, xPoint, yShiftSpace(), fieldWidth, fieldHeight, 3);
			
		cb_defensive_workrate = new JComboBox<String>();			
			setComboBox(cb_defensive_workrate, xPoint, yShift(), fieldWidth, fieldHeight, 3);
			
		cb_strong_foot = new JComboBox<String>();				
			setComboBox(cb_strong_foot, xPoint, yShift(), fieldWidth, fieldHeight, 2);
			
	
	}


																						
	//zmienne pilkarza
	public JFormattedTextField t_acceleration; 			 
	public JFormattedTextField t_sprint_speed;
	
	public JFormattedTextField t_positioning;
	public JFormattedTextField t_finishing;
	public JFormattedTextField t_shot_power;
	public JFormattedTextField t_long_shots;
	public JFormattedTextField t_volleys;
	public JFormattedTextField t_penalties;
	
	public JFormattedTextField t_vision;
	public JFormattedTextField t_crossing;
	public JFormattedTextField t_free_kick;
	public JFormattedTextField t_short_passing;
	public JFormattedTextField t_long_passing;
	public JFormattedTextField t_curve;
	
	public JFormattedTextField t_agility;
	public JFormattedTextField t_balance;
	public JFormattedTextField t_reactions;
	public JFormattedTextField t_ball_control;
	public JFormattedTextField t_dribbling;
	
	public JFormattedTextField t_interceptions;
	public JFormattedTextField t_heading;
	public JFormattedTextField t_marking;
	public JFormattedTextField t_standing_tackle;
	public JFormattedTextField t_sliding_tackle;

	public JFormattedTextField t_jumping;
	public JFormattedTextField t_stamina;
	public JFormattedTextField t_strength;
	public JFormattedTextField t_aggression;
	public JFormattedTextField t_composure;
	
	
	public JFormattedTextField t_height;
	
	public JComboBox<String> cb_weak_foot;
	public JComboBox<String> cb_skill_moves;
	public JComboBox<String> cb_attack_workrate;
	public JComboBox<String> cb_defensive_workrate;
	public JComboBox<String> cb_strong_foot;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
