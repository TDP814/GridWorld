import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 * This class runs a world that contains crab critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class RockLauncherRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 5), new Rock());
        world.add(new Location(5, 4), new Rock());
        world.add(new Location(5, 7), new Rock());
        world.add(new Location(7, 3), new Rock());
        world.add(new Location(7, 8), new Flower());
        world.add(new Location(2, 2), new Flower());
        world.add(new Location(3, 5), new Flower());
        world.add(new Location(3, 8), new Flower());
        Bug bug1 = new Bug(Color.RED);
        Bug bug2 = new Bug(Color.RED);
        world.add(new Location(1,1),bug1);
        world.add(new Location(7,7),bug2);
        world.add(new Location(4, 5), new RockLauncher(bug1));
        world.add(new Location(6, 1), new RockLauncher(bug2));
        
        world.show();
    }
}