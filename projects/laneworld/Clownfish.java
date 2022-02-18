/**
 * Clownfish is a 6/2 pet
 * On Faint: Leaves a 1/2 baby clownfish
 */

public class Clownfish extends Pet{
    public Clownfish(int id, int direction, Team team) {
        super(id, "Clownfish", 6, 2, direction, team);
    }

    public void onFaint(Team opponents) {
        
        
    }

}
