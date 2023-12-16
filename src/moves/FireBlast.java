package moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    final static Type TYPE = Type.FIRE;
    final static double POWER = 110.0;
    final static double ACCURACY = 0.85;
    final static int PRIORITY = 0;
    final static int HITS = 1;
    final static double CHANCE = 0.1;

    public FireBlast() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect effect = new Effect();
        effect.chance(CHANCE);
        effect.condition(Status.BURN);
        effect.turns(4);
        opp.addEffect(effect);
    }
    
    @Override
    protected String describe() {
        return "использует FireBlast";
    }
}