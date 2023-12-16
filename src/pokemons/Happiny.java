package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Happiny extends Pokemon {
    private final static double HP = 100.0;
    private final static double ATTACK = 5.0;
    private final static double DEFENSE = 5.0;
    private final static double SPECIAL_ATTACK = 15.0;
    private final static double SPECIAL_DEFENSE = 65.0;
    private final static double SPEED = 30.0;

    public Happiny(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        setMove(
            new DreamEater(),
            new ThunderWave()
        );
    }
}
