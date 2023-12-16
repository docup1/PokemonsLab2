package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Hippopotas extends Pokemon {
    private final static double HP = 68.0;
    private final static double ATTACK = 72.0;
    private final static double DEFENSE = 78.0;
    private final static double SPECIAL_ATTACK = 38.0;
    private final static double SPECIAL_DEFENSE = 42.0;
    private final static double SPEED = 32.0;

    public Hippopotas(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.FAIRY);
        setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        setMove(
            new Tackle(),
            new Bulldoze(),
            new RockTomb()
        );
    }
}
