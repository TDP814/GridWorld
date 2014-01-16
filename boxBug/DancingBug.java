import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int steps;
    private int[] turns;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] r)
    {
        steps = 0;
        this.turns = turns;
        
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
         if (steps == turns.length) {
            steps=0;
        }
        for (int i = 0; i < this.turns[steps]; i++) {
            turn();
        }
        move();
        steps++;

    }
}
