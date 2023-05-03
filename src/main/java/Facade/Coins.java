package Facade;

public class Coins extends Collectible{

    private static Coins coins = new Coins();

    private Coins() {};

    public static Coins getInstance() {
        return coins;
    }
}
