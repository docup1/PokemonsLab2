package pokemons;

import moves.*;

public class Chansey extends Happiny {
    private final static double HP = 250.0;
    private final static double ATTACK = 5.0;
    private final static double DEFENSE = 5.0;
    private final static double SPECIAL_ATTACK = 35.0;
    private final static double SPECIAL_DEFENSE = 105.0;
    private final static double SPEED = 50.0;

    public Chansey(String name, int level) {
        super(name, level);
        setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        addMove(
            new Present()
        );
    }
}
