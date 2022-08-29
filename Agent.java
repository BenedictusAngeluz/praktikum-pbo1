package praktikum_pbo1;

public class Agent {
    private int health;
    private String name;
    private int pos_x;
    private int pos_y;

    public Agent() {
    }

    public Agent(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void SetPos(int x, int y) {
        this.pos_x = x;
        this.pos_y = y;
    }

    public int GetPos() {
        return pos_x & pos_y;
    }

    public void info() {
        System.out.println("Name : " + this.name + " Health : " + this.health);
    }
}