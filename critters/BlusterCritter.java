import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;


public class BlusterCritter extends Critter{

    private int courageFactor;

    public BlusterCritter(int c){
        super();
        courageFactor = c;
    }

    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();

        Location loc = getLocation();
        for (int  r = loc.getRow() - 2; r<=loc.getRow()+2; r++) {
            for (int c = loc.getCol()-2; c<=loc.getCol()+2; c++) {
                Location tempLoc = new Location(r, c);
                if (getGrid().isValid(tempLoc)) {
                    Actor a = getGrid().get(tempLoc);
                    if (a != null && a != this) {
                        actors.add(a);
                    }
                }
            }
        }
        return actors;
    }
    
    public void processActors(ArrayList<Actor> actors){
        
    }
}