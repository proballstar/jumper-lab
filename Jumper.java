import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

// A Jumper implements the Edible interface. The purpose of this interface is to facilitate the
// determination of which objects a Jumper can jump on and remove. If an Actor implements
// Edible, it can be jumped on, otherwise it can’t. Jumpers should move around a GridWorld
// by jumping over grid locations in its path. This means that instead of always moving to an
// adjacent Location, your Jumper will move to a location two “spaces” away. This actor will
// move forward two cells in each move. It “jumps” over all actors. To “jump” the destination cell
// must be on the grid, empty, or contain Edible actor. If the Jumper can’t jump, it turns 45°. It
// does not leave anything behind it when it jumps (i.e. it does not drop a flower)


/**
 *  A <code>Jumper</code> is an actor that will jump over Rocks and Flowers and
 *  turn. A jumper can remove another jumper by jumping on them.
 * 
 *  @author  TODO Your Name(s)
 *  @version TODO Date
 *  @author  Period: TODO
 *  @author  Assignment: GridWorld_Part3_Jumper
 * 
 *  @author  Sources: TODO
 */
public class Jumper extends Bug implements Edible
{

    public Jumper() 
    {
        super();
    }
    
    public boolean canJumpOnto(Actor a) {
        if (a instanceof Edible) {
            return true;
        } else {
            return false;
        }
    }

    // valid => move there
    // not vaid => turn 45 fdegrees
    public boolean validMove() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            throw new Error("Object Grid World is not defined :(");
        Location l = this.getLocation();
        int c = l.getCol();
        int y = l.getRow();
        int dir = this.getDirection();
        Location current = l;
        Location onceover = l.getAdjacentLocation(dir);
        this.moveTo(onceover);
        Location doubleover = l.getAdjacentLocation(dir);
        this.moveTo(current);
        if(gr.isValid(doubleover)) {
            Actor x = gr.get(doubleover);
            if(canJumpOnto(x)) {
                return true; 
            } else {
                return false;
            }
        }
        return true;
    }

    public void moveTwo()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next2 = next.getAdjacentLocation(getDirection());
        if (this.validMove())
            moveTo(next2);
        else
            turn();
    }
}