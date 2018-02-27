package gui;

import javax.swing.JLabel;

import cardmaker.Player;

public class ResultsLabels {

	
	private final int xPointStart = 580;
	private final int yPointStart = 4;
	
	private int xPoint = xPointStart;
	private int yPoint = yPointStart;
	
	private final int labelWidth = 60;
	private final int labelHeight = 48;
	
	
	
	private int xShift() {
		return xPoint = xPoint + 120;
	}
	
	private int yShift() {
		return yPoint = yPoint + 26;
	}
	
	private int yShiftToStartingPosition() {
		return yPoint = yPointStart + 26;
	}
	
	
	
	
	
	public JLabel l_resultPace;
	public JLabel l_resultShooting;
	public JLabel l_resultPassing;
	public JLabel l_resultDribbling;
	public JLabel l_resultDefending;
	public JLabel l_resultPhysical;
	
	public JLabel l_result_ST;
	public JLabel l_result_CF;
	public JLabel l_result_LF;
	public JLabel l_result_RF;
	public JLabel l_result_LW;
	public JLabel l_result_RW;
	public JLabel l_result_LAM;
	public JLabel l_result_CAM;
	public JLabel l_result_RAM;
	public JLabel l_result_LM;
	public JLabel l_result_CM;
	public JLabel l_result_RM;
	public JLabel l_result_LWB;
	public JLabel l_result_CDM;
	public JLabel l_result_RWB;
	public JLabel l_result_LB;
	public JLabel l_result_CB;
	public JLabel l_result_RB;
	
	
	
	public ResultsLabels(Player player) {
		
	//resulty kartowe
		l_resultPace = new JLabel(player.pace_stats.pace_ovr + " PAC");
			l_resultPace.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_resultShooting = new JLabel(player.shooting_stats.shooting_ovr + " SHO");
			l_resultShooting.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_resultPassing = new JLabel(player.passing_stats.passing_ovr + " PAS");
			l_resultPassing.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_resultDribbling = new JLabel(player.dribbling_stats.dribbling_ovr + " DRI");
			l_resultDribbling.setBounds(xShift(), yShiftToStartingPosition(), labelWidth, labelHeight);
			
		l_resultDefending = new JLabel(player.defending_stats.defending_ovr + " DEF");
			l_resultDefending.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
		l_resultPhysical = new JLabel(player.physical_stats.physical_ovr + " PHY");
			l_resultPhysical.setBounds(xPoint, yShift(), labelWidth, labelHeight);
			
	//resulty pozycyjne
		
		
			
	}
	
	
}
