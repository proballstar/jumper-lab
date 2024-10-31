import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;


// A Jumper implements the Edible interface. The purpose of this interface is to facilitate the
// determination of which objects a Jumper can jump on and remove. If an Actor implements
// Edible, it can be jumped on, otherwise it can’t. Jumpers should move around a GridWorld
// by jumping over grid locations in its path. This means that instead of always moving to an
// adjacent Location, your Jumper will move to a location two “spaces” away. This actor will
// move forward two cells in each move. It “jumps” over all actors. To “jump” the destination cell
// must be on the grid, empty, or contain Edible actor. If the Jumper can’t jump, it turns 45°. It
// does not leave anything behind it when it jumps (i.e. it does not drop a flower)

/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  TODO Name(s)
 *  @version TODO DATE
 *  @author  Period: TODO
 *  @author  Assignment: GridWorld_Part3_Jumper
 *
 *  @author  Sources: TODO
 */
public class JumperRunner
{
    public static void main( String[] args )
    {
        // TODO complete main
    }
}