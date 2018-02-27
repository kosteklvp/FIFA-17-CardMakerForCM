package player;

import cardmaker.MainJFrame;

public class Defending {
	
	public int defending_ovr;
	public double sumOfStats;
	
	public int interceptions;
	public int heading;
	public int marking;
	public int standing_tackle;
	public int sliding_tackle;
	
	
	public Defending(MainJFrame frame) {
		interceptions = Integer.parseInt(frame.textFields.t_interceptions.getText());
		heading = Integer.parseInt(frame.textFields.t_heading.getText());
		marking = Integer.parseInt(frame.textFields.t_marking.getText());
		standing_tackle = Integer.parseInt(frame.textFields.t_standing_tackle.getText());
		sliding_tackle = Integer.parseInt(frame.textFields.t_sliding_tackle.getText());
		
		sumOfStats = 	interceptions * Statistics_ratios.getInterceptionsRatio() +
							heading * Statistics_ratios.getHeadingRatio() +
							marking * Statistics_ratios.getMarkingRatio() +
							standing_tackle * Statistics_ratios.getStandingTackleRatio() +
							sliding_tackle * Statistics_ratios.getSlidingTackleRatio();
		defending_ovr = (int) Math.round((double)(sumOfStats - 1) / 100);
		
	}
	
	
}
