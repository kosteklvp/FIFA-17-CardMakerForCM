package player;

import cardmaker.MainJFrame;

public class Physical {
	
	public int physical_ovr;
	public double sumOfStats;
	
	public int jumping;
	public int stamina;
	public int strength;
	public int aggression;
	public int composure;
	
	public Physical(MainJFrame frame) {
		jumping = Integer.parseInt(frame.textFields.t_jumping.getText());
		stamina = Integer.parseInt(frame.textFields.t_stamina.getText());
		strength = Integer.parseInt(frame.textFields.t_strength.getText());
		aggression = Integer.parseInt(frame.textFields.t_aggression.getText());
		composure = Integer.parseInt(frame.textFields.t_composure.getText());
		
		sumOfStats = 	jumping * Statistics_ratios.getJumpingRatio() + 
						stamina * Statistics_ratios.getStaminaRatio() +
						strength * Statistics_ratios.getStrengthRatio() +
						aggression * Statistics_ratios.getAggressionRatio() +
						composure * Statistics_ratios.getComposure();/////////////uwaga
		physical_ovr = (int) Math.round((double)(sumOfStats - 1) / 100);
		
	}
	
	
	
}
