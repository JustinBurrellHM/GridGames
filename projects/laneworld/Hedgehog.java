import java.util.ArrayList;

/**
 * Hedgehog is a 3/2 pet
 * Faint: Deal 2 damage to all
 */
public class Hedgehog extends Pet {
  
  private ArrayList<Pet> pets;
  private int bonusAtk = 2;

  public Hedgehog(int id, int direction, Team team) {
    super(id, "Hedgehog", 3, 2, direction, team);
  }

  public void onFaint(Team opponents) {
    for (Pet p : pets){
      changeHp(2);
      

    }
    
    
    if (friend != null) {
      LaneWorldLogger.log(String.format("%s gains +%d.", friend, bonusAtk));
      friend.changeAttack(bonusAtk);
      }
    }

  /* TODO */

}
