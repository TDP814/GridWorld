import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter{
    public KingCrab(){
        setColor(Color.PINK);
    }
    public int distanceFrom(Location loc1, Location loc2){

    }
    private boolean moveOneMoreAway(Actor a){

    }
    public void processActors(ArrayList<Actor> actors){
        for (Actor a: actors) {
            if (!moveOneMoreAway(a)) {
                a.removeSelfFromGrid();
            }
        }
    }
}