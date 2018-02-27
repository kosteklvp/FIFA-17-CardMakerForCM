package player;

import cardmaker.MainJFrame;

public class Passing {

	public int passing_ovr;
	public double sumOfStats;
	
	public int vision;
	public int crossing;
	public int free_kick;
	public int short_passing;
	public int long_passing;
	public int curve;
	
	public Passing(MainJFrame frame) {
		vision = Integer.parseInt(frame.textFields.t_vision.getText());
		crossing = Integer.parseInt(frame.textFields.t_crossing.getText());
		free_kick = Integer.parseInt(frame.textFields.t_free_kick.getText());
		short_passing = Integer.parseInt(frame.textFields.t_short_passing.getText());
		long_passing = Integer.parseInt(frame.textFields.t_long_passing.getText());
		curve = Integer.parseInt(frame.textFields.t_curve.getText());
		
		sumOfStats =	vision * Statistics_ratios.getVisionRatio() +
						crossing * Statistics_ratios.getCrossingRatio() +
						free_kick * Statistics_ratios.getFreeKickRatio() +
						short_passing * Statistics_ratios.getShortPassingRatio() +
						long_passing * Statistics_ratios.getLongPassingRatio() + 
						curve * Statistics_ratios.getCurveRatio();
		passing_ovr = (int) Math.round((double)(sumOfStats - 1) / 100);
		
	}
	
	
	
	
}
