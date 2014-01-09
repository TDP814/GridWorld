import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        if (getDirection() != 90) {
            setDirection(90);
        }
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {


        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            if(getDirection() == 90){
               turn();
               turn();
               turn();
            } else if(getDirection() == 225){
                turn();
                turn();
                turn();
                turn();
                turn();
            }
            steps = 0;
        }
    }
}