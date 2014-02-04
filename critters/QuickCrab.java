import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter
{
    public QuickCrab()
    {
        setColor(Color.CYAN);
    }

    public ArrayList<Location> getMoveLocations(){
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid g = getGrid();

        addIfTwoAwayFree(locs.getDirection()+ Location.Left);
        addIfTwoAwayFree(locs.getDirection()+ Location.Right);
    }

    public void addIfTwoAwayFree(ArrayList<Location> locs, int dir){
        Grid g = getGrid();
        Location loc = getLocation();
        Location temp = loc.getAdjacentLocation(dir);

        if (g.isValid(temp) && g.get(temp) == null) {
            Location loc2 =temp.getAdjacentLocation(dirs);
            if (g.isValid(loc2)&&g.get(loc2) == null) {
                locs.add(loc2);
            }
        }
    }
       
}