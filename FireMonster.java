package Task_08;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire and deal 1 damage!";
    }
}
