import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.util.Random;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        Random object = new Random();
        int[] random = new int[8];
        for (int i=0; i<random.length; i++) {
            random[i] = object.newInt(8);
        }
        ActorWorld world = new ActorWorld();
        //BoxBug alice = new BoxBug(6);
        //alice.setColor(Color.ORANGE);
        //CircleBug bob = new CircleBug(1);
        //SpiralBug tom = new SpiralBug(1);
        //ZBug brad = new ZBug(5);
        DancingBug s = new DancingBug(random);
        //world.add(new Location(7, 8), alice);
        //world.add(new Location(5, 5), bob);
        //world.add(new Location(9, 9), tom);
        //world.add(new Location(1, 1), brad);
        world.add(new Location(2, 2), s);
        world.show();
    }
}