package Facade;

public class PlayerFacade {
    public static boolean verifyLevelPassed(Player player) {
        if (Mushroom.getInstance().verifyLevelPassed(player)) {
            return false;
        }
        if (Coins.getInstance().verifyLevelPassed(player)) {
            return false;
        }
        if (Jewels.getInstance().verifyLevelPassed(player)) {
            return false;
        }
        return true;
    }

}
