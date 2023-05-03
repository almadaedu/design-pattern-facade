package Facade;

public class Jewels extends Collectible{

    private static Jewels jewels = new Jewels();

    private Jewels() {};

    public static Jewels getInstance() {
        return jewels;
    }
}
