package player;

import cardmaker.Player;

public class PositionOveralls {

	public int value_ST;
	public int value_CF;
	public int value_LF;
	public int value_RF;
	public int value_LW;
	public int value_RW;
	public int value_CAM;
	public int value_LM;
	public int value_CM;
	public int value_RM;
	public int value_LWB;
	public int value_CDM;
	public int value_RWB;
	public int value_LB;
	public int value_CB;
	public int value_RB;
	
	private int sumOfStats;
	
	public void setValues(Player player) {
		
		//ST
		sumOfStats =  	18 * player.shooting_stats.finishing +
						13 * player.shooting_stats.positioning +
						10 * player.defending_stats.heading +
						10 * player.dribbling_stats.ball_control +
						10 * player.shooting_stats.shot_power +
						8 * player.dribbling_stats.reactions +
						7 * player.dribbling_stats.dribbling +
						5 * player.pace_stats.sprint_speed +
						5 * player.physical_stats.strength +
						5 * player.passing_stats.short_passing +
						4 * player.pace_stats.acceleration + 
						3 * player.shooting_stats.long_shots +
						2 * player.shooting_stats.volleys + 
						addAllStatsToOverall_Attacker(player);
		
		value_ST = (int) Math.round((double)(sumOfStats - 1) / 100);
		
		
		//CF LF RF
		sumOfStats = 	15 * player.dribbling_stats.ball_control +
						14 * player.dribbling_stats.dribbling +
						13 * player.shooting_stats.positioning +
						11 * player.shooting_stats.finishing +
						9 * player.passing_stats.short_passing +
						9 * player.dribbling_stats.reactions +
						8 * player.passing_stats.vision +
						5 * player.pace_stats.sprint_speed +
						5 * player.pace_stats.acceleration +
						5 * player.shooting_stats.shot_power +
						4 * player.shooting_stats.long_shots +
						2 * player.defending_stats.heading + 
						addAllStatsToOverall_Attacker(player);
		
		value_CF = (int) Math.round((double)(sumOfStats - 1) / 100);
		value_LF = (int) Math.round((double)(sumOfStats - 1) / 100);
		value_RF = (int) Math.round((double)(sumOfStats - 1) / 100);
		
		
		//LW RW
		sumOfStats = 	16 * player.dribbling_stats.dribbling +
						14 * player.dribbling_stats.ball_control +
						10 * player.shooting_stats.finishing +
						9 * player.shooting_stats.positioning +
						9 * player.passing_stats.crossing +
						9 * player.passing_stats.short_passing +
						7 * player.pace_stats.acceleration +
						7 * player.dribbling_stats.reactions + 
						6 * player.pace_stats.sprint_speed +
						6 * player.passing_stats.vision +
						4 * player.shooting_stats.long_shots +
						3 * player.dribbling_stats.agility +
						addAllStatsToOverall_Attacker(player);
		
		value_LW = (int) Math.round((double)(sumOfStats - 1) / 100);
		value_RW = (int) Math.round((double)(sumOfStats - 1) / 100);
		
		
		//CAM
		sumOfStats = 	16 * player.passing_stats.short_passing +
						15 * player.dribbling_stats.ball_control +
						14 * player.passing_stats.vision +
						13 * player.shooting_stats.finishing +
						9 * player.shooting_stats.positioning +
						7 * player.dribbling_stats.reactions +
						7 * player.shooting_stats.finishing +
						5 * player.shooting_stats.long_shots +
						4 * player.passing_stats.long_passing +
						3 * player.pace_stats.sprint_speed +
						3 * player.dribbling_stats.agility +
						addAllStatsToOverall_OffensiveMiddlefielder(player);
		
		value_CAM = (int) Math.round((double)(sumOfStats - 1) / 100);
		
		//LM RM
		sumOfStats = 	15 * player.dribbling_stats.dribbling +
						13 * player.dribbling_stats.ball_control +
						11 * player.passing_stats.short_passing +
						10 * player.passing_stats.crossing +
						8 * player.shooting_stats.positioning +
						7 * player.passing_stats.vision +
						7 * player.pace_stats.acceleration +
						7 * player.dribbling_stats.reactions +
						6 * player.shooting_stats.finishing +
						6 * player.pace_stats.acceleration +
						5 * player.physical_stats.jumping +
						5 * player.passing_stats.long_passing +
						addAllStatsToOverall_OffensiveMiddlefielder(player);
		value_LM = (int) Math.round((double)(sumOfStats - 1) / 100);
		value_RM = (int) Math.round((double)(sumOfStats - 1) / 100);
		
		//CM
		sumOfStats = 	17 * player.passing_stats.short_passing +
						14 * player.dribbling_stats.ball_control +
						13 * player.passing_stats.vision +
						13 * player.passing_stats.long_passing +
						8 * player.dribbling_stats.reactions +
						7 * player.dribbling_stats.dribbling +
						6 * player.physical_stats.stamina +
						6 * player.shooting_stats.positioning +
						5 * player.defending_stats.interceptions +
						5 * player.defending_stats.standing_tackle +
						4 * player.shooting_stats.long_shots +
						2 * player.shooting_stats.finishing +
						addWeakFootToOverall(player.info_stats.weak_foot);
		value_CM = (int) Math.round((double)(sumOfStats - 1) / 100);
		
		//CDM
		sumOfStats = 	14 * player.defending_stats.interceptions +
						14 * player.passing_stats.short_passing +
						12 * player.defending_stats.standing_tackle +
						10 * player.passing_stats.long_passing +
						9 * player.defending_stats.marking +
						7 * player.dribbling_stats.reactions +
						6 * player.physical_stats.stamina +
						5 * player.physical_stats.aggression +
						5 * player.defending_stats.sliding_tackle +
						4 * player.shooting_stats.positioning +
						4 + player.physical_stats.strength +
						addAllStatsToOverall_DefensiveMiddlefielder(player);
		value_CDM = (int) Math.round((double)(sumOfStats - 1) / 100);
	}
	
	
	


	private int addWeakFootToOverall(int value) {
		return (value - 3) * 100 ;
	}
	
	
//attacker	
	private int addSkillMovesToOverall_Attacker(int value) {
		
		if(value==4 || value==5) {
			return 100;
		}
		
		return 0;		
	}
	
	private int addAttackWorkrateToOverall_Attacker(char value) {
		if(value=='H') {
			return 100;
		} else if(value=='L') {
			return -100;
		}
		return 0;
	}
	
	private int addDefensiveWorkrateToOverall_Attacker(char value) {
		if(value=='H') {
			return -100;
		}
		return 0;
	}
	
	
//offmiddlefielder
	private int addSkillMovesToOverall_OffensiveMiddlefielder(int value) {
		
		if(value==4 || value==5) {
			return 100;
		}
		
		return 0;		
	}
	
	private int addAttackWorkrateToOverall_OffensiveMiddlefielder(char value) {
		if(value=='L') {
			return -100;
		}
		return 0;
	}
	
	private int addDefensiveWorkrateToOverall_OffensiveMiddlefielder(char value) {
		if(value=='H') {
			return -100;
		}
		return 0;
	}
	
//defmiddlefielder	
	private int addAttackWorkrateToOverall_DefensiveMiddlefielder(char value) {
		if(value=='L') {
			return 100;
		} else if(value=='H') {
			return -100;
		}
		return 0;
	}
	
	private int addDefensiveWorkrateToOverall_DefensiveMiddlefielder(char value) {
		if(value=='H') {
			return 100;
		} else if(value=='L') {
			return -100;
		}
		return 0;
	}
	
	
	
	
	
//laczniki powyzszych funkcji
	private int addAllStatsToOverall_Attacker(Player player) {
		return 	addWeakFootToOverall(player.info_stats.weak_foot) + 
				addSkillMovesToOverall_Attacker(player.info_stats.skill_moves) +
				addAttackWorkrateToOverall_Attacker(player.info_stats.attack_workrate) +
				addDefensiveWorkrateToOverall_Attacker(player.info_stats.defensive_workrate);
	}
	
	private int addAllStatsToOverall_OffensiveMiddlefielder(Player player) {
		return 	addWeakFootToOverall(player.info_stats.weak_foot) + 
				addSkillMovesToOverall_OffensiveMiddlefielder(player.info_stats.skill_moves) +
				addAttackWorkrateToOverall_OffensiveMiddlefielder(player.info_stats.attack_workrate) +
				addDefensiveWorkrateToOverall_OffensiveMiddlefielder(player.info_stats.defensive_workrate);
	}
	
	private int addAllStatsToOverall_DefensiveMiddlefielder(Player player) {
		return 	addWeakFootToOverall(player.info_stats.weak_foot) + 
				addAttackWorkrateToOverall_DefensiveMiddlefielder(player.info_stats.attack_workrate) +
				addDefensiveWorkrateToOverall_DefensiveMiddlefielder(player.info_stats.defensive_workrate);
	}
	
	
	
}
