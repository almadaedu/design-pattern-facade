package Facade;
import java.util.ArrayList;
import java.util.List;
public abstract class Collectible {
    private List<Player> playerCollectibles = new ArrayList<Player>();

    public void addPlayer(Player player) {
        this.playerCollectibles.add(player);
    }

    public boolean verifyLevelPassed(Player player) {
        return this.playerCollectibles.contains(player);
    }
}
