package player;

import cardmaker.MainJFrame;

public class Info {

	public int skill_moves;
	public int weak_foot;
	public int height;
	public char strong_foot;
	public char attack_workrate;
	public char defensive_workrate;
	
	
	
	public Info(MainJFrame frame) {
		height = Integer.parseInt(frame.textFields.t_height.getText());
		weak_foot = Integer.parseInt(frame.textFields.cb_weak_foot.getSelectedItem().toString());
		skill_moves = Integer.parseInt(frame.textFields.cb_skill_moves.getSelectedItem().toString());
		strong_foot = frame.textFields.cb_strong_foot.getSelectedItem().toString().charAt(0);
		attack_workrate = frame.textFields.cb_attack_workrate.getSelectedItem().toString().charAt(0);
		defensive_workrate = frame.textFields.cb_defensive_workrate.getSelectedItem().toString().charAt(0);
	}
	
}
