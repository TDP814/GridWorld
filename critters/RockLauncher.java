import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class RockLauncher extends Critter{
    public RockLauncher(){
        setColor(Color.BLACK);
    }
    
    public void processActors(ArrayList<Actor> actors){
        ArrayList<Actor> al= new ArrayList<Actor>();
        for (Actor a: actors) {
            if (a instanceof Rock) {
               Location temp = this.target.getLocation();
               this.target.removeSelfFromGrid();
               a.moveTo(temp);
            }   
        }
    }
}