package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    private final static Type TYPE = Type.ELECTRIC;
    private final static double POWER = 0.0;
    private final static double ACCURACY = 0.9;
    private final static int PRIORITY = 0;
    private final static int HITS = 1;
    
    public ThunderWave() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.paralyze(opp);
    }
    
    @Override
    protected String describe() {
        return "использует ThunderWave";
    }
}