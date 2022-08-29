package praktikum_pbo1;

public class Player {
    private int direction;
    private int id;
    private int strength;

    public Player() {
    }

    public Player(int id, int direction) {
        this.id = id;
        this.direction = direction;
    }

    public void AddStrength(int str) {
        this.strength = str;
        str += 2;
        System.out.println("Strength increased !");
        System.out.println("Current strength : " + this.strength);
    }

    public void InfoPlayer() {
        System.out.println("Player ID : " + this.id + " Direction : " + this.direction);
    }
}
