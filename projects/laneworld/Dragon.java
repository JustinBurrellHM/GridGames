public class Dragon extends Pet{

    private int fireball = -12;

    public Dragon(int id, int direction, Team team) {
        super(id, "Dragon", 1, 2, direction, team);
    }
    public void onStart(Team opponents){
        Pet backPet = opponents.getBackPet();
        backPet.changeHp(fireball);
    }
    
}
