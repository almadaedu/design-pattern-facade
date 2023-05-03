
import Facade.Coins;
import Facade.Jewels;
import Facade.Mushroom;
import Facade.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PlayerTest {

    @Test
    void returnMushroomCollectible() {
        Player player = new Player();
        Mushroom.getInstance().addPlayer(player);

        assertEquals(false, player.winLevel());
    }

    @Test
    void returnCoinsCollectible() {
        Player player = new Player();
        Coins.getInstance().addPlayer(player);

        assertEquals(false, player.winLevel());
    }

    @Test
    void returnJewelCollectible() {
        Player player = new Player();
        Jewels.getInstance().addPlayer(player);

        assertEquals(false, player.winLevel());
    }

}
