/**
 * Bluebird is a 2/1 pet
 * Start: Give the frontmost pet +1/0
 */
public class Bluebird extends Pet {

  public Bluebird(int id, int direction, Team team) {
    super(id, "Bluebird", 2, 1, direction, team);
  }

  public void onStart(Team opponents) {
    int bonusAtk = 1;
    Pet frontmostPet = team.getFrontPet();
    if (frontmostPet != null) {
      LaneWorldLogger.log(String.format("%s gains +%d/+%d.", frontmostPet, bonusAtk));
      frontmostPet.changeAttack(bonusAtk);
    }
  }

}
