package Facade;

public class Mushroom extends Collectible {

    private static Mushroom mushroom = new Mushroom();

    private Mushroom() {};

    public static Mushroom getInstance() {
        return mushroom;
    }
}
