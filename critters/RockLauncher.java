import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class RockLauncher extends CrabCritter{
    public RockLauncher(){
        setColor(Color.BLACK);
    }
    public int distanceFrom(Location loc1, Location loc2){
        int x1 = loc1.getRow();
        int y1 = loc1.getCol();
        int x2 = loc2.getRow();
        int y2 = loc2.getCol();
        double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) + .5);
        return (int)Math.floor(dist);
    }
    public void processActors(ArrayList<Actor> actors){
        ArrayList<Actor> al= new ArrayList<Actor>();
        Location point = getLocation();
        for (Actor a: actors) {
            if (a instanceof Rock) {
                int i =0;
                while (al.size() == 0) {
                    i++;
                    for (int f = 0; f<i; f++) {
                        for (int g = 0; g<i; g++) {
                            Location ne =new Location(point.getRow)+f,point.getCol()+g
                            if (getGrid().isValid && getGrid().get(ne) != null && !(ne.compareTo(getLocation()) == 0)) {
                                al.add(l);
                            }
                        }
                    }
                }
            }
        }
    }
}