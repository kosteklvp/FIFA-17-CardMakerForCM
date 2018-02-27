package gui;

import javax.swing.JLabel;

import cardmaker.MainJFrame;
import cardmaker.Player;

public class Labels {
	
	private final int xPointStart = 36;
	private final int yPointStart = 1;
	
	private int xPoint = xPointStart;
	private int yPoint = yPointStart;
	
	private final int labelWidth = 200;
	private final int labelHeight = 24;
	
	
	
	
	private int yShift() {
		return yPoint = yPoint + 26;
	}
	
	private int yShiftSpace() {
		return yPoint = yPoint + 50;
	}
	
	private int yShiftTwoSpaces() {
		return yPoint = yPoint + 50 + 26;
	}
	
	private int yShiftToStartingPosition() {
		return yPoint = yPointStart + 26;
	}
	
	private int xShiftResult() {
		return xPoint = xPoint + 120;
	}
	
	
	
	
	public void addLabels(MainJFrame currentFrame) {
		currentFrame.add(currentFrame.labels.l_acceleration);
		currentFrame.add(currentFrame.labels.l_agility);
		currentFrame.add(currentFrame.labels.l_jumping);
		currentFrame.add(currentFrame.labels.l_strength);
		currentFrame.add(currentFrame.labels.l_aggression);
		currentFrame.add(currentFrame.labels.l_interceptions);
		currentFrame.add(currentFrame.labels.l_vision);
		currentFrame.add(currentFrame.labels.l_ball_control);
		currentFrame.add(currentFrame.labels.l_dribbling);
		currentFrame.add(currentFrame.labels.l_free_kick);
		currentFrame.add(currentFrame.labels.l_long_passing);
		currentFrame.add(currentFrame.labels.l_marking);
		currentFrame.add(currentFrame.labels.l_long_shots);
		currentFrame.add(currentFrame.labels.l_sliding_tackle);
		currentFrame.add(currentFrame.labels.l_curve);
		currentFrame.add(currentFrame.labels.l_skill_moves);
		currentFrame.add(currentFrame.labels.l_weak_foot);
		currentFrame.add(currentFrame.labels.l_height);
		
		
		currentFrame.add(currentFrame.labels.l_sprint_speed);
		currentFrame.add(currentFrame.labels.l_balance);
		currentFrame.add(currentFrame.labels.l_stamina);
		currentFrame.add(currentFrame.labels.l_reactions);
		currentFrame.add(currentFrame.labels.l_composure);
		currentFrame.add(currentFrame.labels.l_positioning);
		currentFrame.add(currentFrame.labels.l_crossing);
		currentFrame.add(currentFrame.labels.l_finishing);
		currentFrame.add(currentFrame.labels.l_heading);
		currentFrame.add(currentFrame.labels.l_short_passing);
		currentFrame.add(currentFrame.labels.l_shot_power);
		currentFrame.add(currentFrame.labels.l_standing_tackle);
		currentFrame.add(currentFrame.labels.l_volleys);
		currentFrame.add(currentFrame.labels.l_penalties);
		currentFrame.add(currentFrame.labels.l_attack_workrate);
		currentFrame.add(currentFrame.labels.l_defensive_workrate);
		currentFrame.add(currentFrame.labels.l_strong_foot);
		
		
		currentFrame.add(currentFrame.labels.l_result_pace);
		currentFrame.add(currentFrame.labels.l_result_shooting);
		currentFrame.add(currentFrame.labels.l_result_passing);
		currentFrame.add(currentFrame.labels.l_result_dribbling);
		currentFrame.add(currentFrame.labels.l_result_defending);
		currentFrame.add(currentFrame.labels.l_result_physical);
		currentFrame.add(currentFrame.labels.lErrorEmptyField);
	}
	
	
	public void setAndDisplayResults(Player player) {
		l_result_pace.setText(player.pace_stats.pace_ovr + " PAC");
		l_result_shooting.setText(player.shooting_stats.shooting_ovr + " SHO");
		l_result_passing.setText(player.passing_stats.passing_ovr + " PAS");
		l_result_dribbling.setText(player.dribbling_stats.dribbling_ovr + " DRI");
		l_result_defending.setText(player.defending_stats.defending_ovr + " DEF");
		l_result_physical.setText(player.physical_stats.physical_ovr + " PHY");
	}
	
	
	//KONSTRUKTOR
	public Labels() {
		
		
		//LEWA kolumna
		l_acceleration = new JLabel("Przyspieszenie");
			l_acceleration.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_agility = new JLabel("Zwinnoœæ");
			l_agility.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_jumping = new JLabel("Skocznoœæ");
			l_jumping.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_strength = new JLabel("Si³a");
			l_strength.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		l_aggression = new JLabel("Agresja");
			l_aggression.setBounds(xPoint, yShiftSpace(), labelWidth, labelHeight);
		
		l_interceptions = new JLabel("Przechwyty");
			l_interceptions.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_vision = new JLabel("Orientacja");
			l_vision.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		l_ball_control = new JLabel("Kontrola pi³ki");
			l_ball_control.setBounds(xPoint, yShiftSpace(), labelWidth, labelHeight);
		
		l_dribbling = new JLabel("Drybling");
			l_dribbling.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_free_kick = new JLabel("Rzut wolny");
			l_free_kick.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_long_passing = new JLabel("D³ugie podania");
			l_long_passing.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_marking = new JLabel("Krycie");
			l_marking.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_long_shots = new JLabel("Dalekie strza³y");
			l_long_shots.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_sliding_tackle = new JLabel("Wœlizg");
			l_sliding_tackle.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_curve = new JLabel("Podkrêcenie");
			l_curve.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		l_height = new JLabel("Wzrost");
			l_height.setBounds(xPoint, yShiftSpace(), labelWidth, labelHeight);
		
		l_weak_foot = new JLabel("S³absza noga");
			l_weak_foot.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_skill_moves = new JLabel("Sztuczki");
			l_skill_moves.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		//PRAWA KOLUMNA
		xPoint+=220;
			
		l_sprint_speed = new JLabel("Szybkoœæ biegu");
			l_sprint_speed.setBounds(xPoint, yShiftToStartingPosition(), labelWidth, labelHeight);
		
		l_balance = new JLabel("Równowaga");
			l_balance.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_stamina = new JLabel("Wytrzyma³oœæ");
			l_stamina.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_reactions = new JLabel("Reakcje");
			l_reactions.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		l_composure = new JLabel("Opanowanie");
			l_composure.setBounds(xPoint, yShiftSpace(), labelWidth, labelHeight);
		
		l_positioning = new JLabel("Ustawienie w ataku");
			l_positioning.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		
		l_crossing = new JLabel("Doœrodkowania");
			l_crossing.setBounds(xPoint, yShiftTwoSpaces(), labelWidth, labelHeight);
		
		l_finishing = new JLabel("Wykoñczenie");
			l_finishing.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_heading = new JLabel("G³ówki");
			l_heading.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_short_passing = new JLabel("Podania");
			l_short_passing.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_shot_power = new JLabel("Si³a strza³u");
			l_shot_power.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_standing_tackle = new JLabel("Odbiór pi³ki");
			l_standing_tackle.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_volleys = new JLabel("Woleje");
			l_volleys.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_penalties = new JLabel("Rzuty karne");
			l_penalties.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		l_attack_workrate = new JLabel("Pracowitoœæ w ataku");
			l_attack_workrate.setBounds(xPoint, yShiftSpace(), labelWidth, labelHeight);
		
		l_defensive_workrate = new JLabel("Pracowitoœæ w obronie");
			l_defensive_workrate.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_strong_foot = new JLabel("Lepsza noga");
			l_strong_foot.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		//resultaty
		
		xPoint=580;
		l_result_pace = new JLabel(" ");
			l_result_pace.setBounds(xPoint, yShiftToStartingPosition(), labelWidth, labelHeight);
		
		l_result_shooting = new JLabel(" ");
			l_result_shooting.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_result_passing = new JLabel(" ");
			l_result_passing.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		
		l_result_dribbling = new JLabel(" ");
			l_result_dribbling.setBounds(xShiftResult(), yShiftToStartingPosition(), labelWidth, labelHeight);
		
		l_result_defending = new JLabel(" ");
			l_result_defending.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		l_result_physical = new JLabel(" ");
			l_result_physical.setBounds(xPoint, yShift(), labelWidth, labelHeight);
		
		
		lErrorEmptyField = new JLabel(" ");
			lErrorEmptyField.setBounds(200, 606, 200, 24);
			
		
	}
	

	
	
	
	
	
	public JLabel l_acceleration; 			 
	public JLabel l_sprint_speed;
	
	public JLabel l_positioning;
	public JLabel l_finishing;
	public JLabel l_shot_power;
	public JLabel l_long_shots;
	public JLabel l_volleys;
	public JLabel l_penalties;
	
	public JLabel l_vision;
	public JLabel l_crossing;
	public JLabel l_free_kick;
	public JLabel l_short_passing;
	public JLabel l_long_passing;
	public JLabel l_curve;
	
	public JLabel l_agility;
	public JLabel l_balance;
	public JLabel l_reactions;
	public JLabel l_ball_control;
	public JLabel l_dribbling;
	
	public JLabel l_interceptions;
	public JLabel l_heading;
	public JLabel l_marking;
	public JLabel l_standing_tackle;
	public JLabel l_sliding_tackle;

	public JLabel l_jumping;
	public JLabel l_stamina;
	public JLabel l_strength;
	public JLabel l_aggression;
	public JLabel l_composure;
	
	public JLabel l_skill_moves;
	public JLabel l_weak_foot;
	public JLabel l_strong_foot;
	public JLabel l_height;
	public JLabel l_attack_workrate;
	public JLabel l_defensive_workrate;
	
	
	
	public JLabel l_result_pace;
	public JLabel l_result_shooting;
	public JLabel l_result_passing;
	public JLabel l_result_dribbling;
	public JLabel l_result_defending;
	public JLabel l_result_physical;
	
	public JLabel lErrorEmptyField;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
