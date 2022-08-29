package praktikum_pbo1;

public class MainPraktikum1 {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Agent agent2 = new Agent("cobaagent", 10);
        Player player = new Player(0, 0);
        Player player2 = new Player(10, 5);

        agent.info();
        agent2.info();
        player.InfoPlayer();
        player2.InfoPlayer();
    }
}
