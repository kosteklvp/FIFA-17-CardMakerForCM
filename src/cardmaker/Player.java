package cardmaker;

import player.*;

public class Player {

	
	
	public Defending defending_stats;
	public Dribbling dribbling_stats;
	public Info info_stats;
	public Pace pace_stats;
	public Passing passing_stats;
	public Physical physical_stats;
	public Shooting shooting_stats;
	
	
	
	public Player(MainJFrame frame) {
		defending_stats = new Defending(frame);
		dribbling_stats = new Dribbling(frame);
		info_stats = new Info(frame);
		pace_stats = new Pace(frame);
		passing_stats = new Passing(frame);
		physical_stats = new Physical(frame);
		shooting_stats = new Shooting(frame);
	}

	
	
	
}
