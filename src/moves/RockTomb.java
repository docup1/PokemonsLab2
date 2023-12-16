package moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    private final static Type TYPE = Type.ROCK;
    private final static double POWER = 60.0;
    private final static double ACCURACY = 0.95;
    private final static int PRIORITY = 0;
    private final static int HITS = 1;

    public RockTomb() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует RockTomb";
    }
}