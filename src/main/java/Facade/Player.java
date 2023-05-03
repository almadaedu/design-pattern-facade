package Facade;

public class Player {
    public boolean winLevel() {
        return PlayerFacade.verifyLevelPassed(this);
    }
}
