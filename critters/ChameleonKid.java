import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter {
	public ArayList<Actor> getActors{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = {Location.AHEAD, Location.HALF_Circle};
		for (Location lox: getLocationInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			if (a != null) {
				actos.add(a);
			}
			return actors;
		}
		public ArrayList<Location> getLocationInDirections(int[] directions){
			ArrrayList<Location> locs = new ArrayList<Location>();
			Grid gr = getGrid();
			Location loc = getLocation();
			for (int d: directions ) {
				Location neighborLoc = loc.getAdjacentLocation(getDirection()+d);
				if (gr.isValid(neighborLoc)) {
					locs.add(neighborLoc);
				}
				return locs;
			}
		}
	}
}