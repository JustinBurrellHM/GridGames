import java.util.ArrayList;

/**
 * Hedgehog is a 3/2 pet
 * Faint: Deal 2 damage to all
 */
public class Hedgehog extends Pet {
  
  private ArrayList<Pet> pets;

  public Hedgehog(int id, int direction, Team team) {
    super(id, "Hedgehog", 3, 2, direction, team);
  }

  public void onFaint(Team opponents) {
    ArrayList<Pet> o = opponents.getPets();
    ArrayList<Pet> t = team.getPets();
    
    for (int i = 0; i < t.size(); i++) {
      t.get(i).changeHp(-2);
   
    for (int z = 0; z < o.size(); z++) {
      o.get(i).changeHp(-2);
      
    }
  }
}
}
    

 


