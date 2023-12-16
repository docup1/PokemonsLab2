package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Heatran extends Pokemon {
    private final static double HP = 91.0;
    private final static double ATTACK = 90.0;
    private final static double DEFENSE = 106.0;
    private final static double SPECIAL_ATTACK = 130.0;
    private final static double SPECIAL_DEFENSE = 106.0;
    private final static double SPEED = 77.0;

    public Heatran(String name, int level) {
        super(name, level);
        setType(Type.FIRE, Type.STEEL);
        setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        setMove(
            new FlameCharge(),
            new FlashCanon(),
            new StoneEdge(),
            new FireBlast()
        );
    }
}
