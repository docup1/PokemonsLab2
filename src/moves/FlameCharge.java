package moves;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
    private final static Type TYPE = Type.FIRE;
    private final static double POWER = 50.0;
    private final static double ACCURACY = 1.0;
    private final static int PRIORITY = 0;
    private final static int HITS = 1;

    public FlameCharge() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.SPEED, +1);
    }

    @Override
    protected String describe() {
        return "использует FlameCharge";
    }
}