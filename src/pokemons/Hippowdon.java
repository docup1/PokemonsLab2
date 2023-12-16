package pokemons;

import moves.*;

public class Hippowdon extends Hippopotas {
    private final static double HP = 108.0;
    private final static double ATTACK = 112.0;
    private final static double DEFENSE = 118.0;
    private final static double SPECIAL_ATTACK = 68.0;
    private final static double SPECIAL_DEFENSE = 72.0;
    private final static double SPEED = 47.0;

    public Hippowdon(String name, int level) {
        super(name, level);
        setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        addMove(
            new StoneEdge()
        );
    }
}
