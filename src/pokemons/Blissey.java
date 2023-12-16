package pokemons;

import moves.*;

public class Blissey extends Chansey {
    private final static double HP = 250.0;
    private final static double ATTACK = 10.0;
    private final static double DEFENSE = 10.0;
    private final static double SPECIAL_ATTACK = 75.0;
    private final static double SPECIAL_DEFENSE = 135.0;
    private final static double SPEED = 55.0;

    public Blissey(String name, int level) {
        super(name, level);
        setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        addMove(
            new Flamethrower()
        );
    }
}
