package Task_08;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Fire Monster");
        Monster m2 = new WaterMonster("Water Monster");
        Monster m3 = new StoneMonster("Stone Monster");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Stone Monster B");
        System.out.println(m1.attack());

        Monster m4 = new Monster("New Monster");
        System.out.println(m4.attack());
    }
}