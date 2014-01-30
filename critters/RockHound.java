import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class RockHound extends Critter {
	
	public void processActos(ArrayList<Actor> actors){
		for (Actor a: actors) {
			if (a instanceof Rock) {
				a.removeSelfFromGrid();
			}
		}
	}

}