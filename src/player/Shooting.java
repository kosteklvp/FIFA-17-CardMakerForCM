package player;

import cardmaker.MainJFrame;

public class Shooting {
	
	
	public int shooting_ovr;
	public int sumOfStats;
	
	
	public int positioning;
	public int finishing;
	public int shot_power;
	public int long_shots;
	public int volleys;
	public int penalties;
	
	public Shooting(MainJFrame frame) {
		positioning = Integer.parseInt(frame.textFields.t_positioning.getText());
		finishing = Integer.parseInt(frame.textFields.t_finishing.getText());
		shot_power = Integer.parseInt(frame.textFields.t_shot_power.getText());
		long_shots = Integer.parseInt(frame.textFields.t_long_shots.getText());
		volleys = Integer.parseInt(frame.textFields.t_volleys.getText());
		penalties = Integer.parseInt(frame.textFields.t_penalties.getText());
		
		sumOfStats =	positioning * Statistics_ratios.getPositioningRatio() +
						finishing * Statistics_ratios.getFinishingRatio() +
						shot_power * Statistics_ratios.getShotPowerRatio() +
						long_shots * Statistics_ratios.getLongShotsRatio() +
						volleys * Statistics_ratios.getVolleysRatio() +
						penalties * Statistics_ratios.getPenaltiesRatio();
		shooting_ovr = (int) Math.round((double)(sumOfStats - 1) / 100);
		
	}
	
	
	
	
}
