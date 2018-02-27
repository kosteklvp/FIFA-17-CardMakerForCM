package player;

import cardmaker.MainJFrame;

public class Dribbling {

	public int dribbling_ovr;
	public double sumOfStats;
	
	public int agility;
	public int balance;
	public int reactions;
	public int ball_control;
	public int dribbling;
	
	public Dribbling(MainJFrame frame) {
		agility = Integer.parseInt(frame.textFields.t_agility.getText());
		balance = Integer.parseInt(frame.textFields.t_balance.getText());
		reactions = Integer.parseInt(frame.textFields.t_reactions.getText());
		ball_control = Integer.parseInt(frame.textFields.t_ball_control.getText());
		dribbling = Integer.parseInt(frame.textFields.t_dribbling.getText());
		
		sumOfStats = 	agility * Statistics_ratios.getAgilityRatio() +
							balance * Statistics_ratios.getBalanceRatio() +
							reactions * Statistics_ratios.getReactionsRatio() +
							ball_control * Statistics_ratios.getBallControlRatio() +
							dribbling * Statistics_ratios.getDribblingRatio();
		dribbling_ovr = (int) Math.round((double)(sumOfStats - 1) / 100);
			
	}
	
	
	
}
