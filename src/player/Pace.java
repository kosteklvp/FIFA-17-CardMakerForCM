package player;

import cardmaker.MainJFrame;

public class Pace {

	public int pace_ovr;
	public double sumOfStats;
	
	public int acceleration;
	public int sprint_speed;
	
	
	public Pace(MainJFrame frame) {
		acceleration = Integer.parseInt(frame.textFields.t_acceleration.getText());
		sprint_speed = Integer.parseInt(frame.textFields.t_sprint_speed.getText());
		sumOfStats = 	acceleration * Statistics_ratios.getAccelerationRatio() +
							sprint_speed * Statistics_ratios.getSprintSpeedRatio();
		pace_ovr = (int) Math.round((double)(sumOfStats - 1) / 100);
		
	}

	
	
}
