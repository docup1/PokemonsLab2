package moves;

import ru.ifmo.se.pokemon.*;

public class FlashCanon extends SpecialMove {
    final static Type TYPE = Type.STEEL;
    final static double POWER = 80.0;
    final static double ACCURACY = 1.0;
    final static int PRIORITY = 0;
    final static int HITS = 1;
    final static double CHANCE = 0.1;

    public FlashCanon() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect effect = new Effect();
        effect.chance(CHANCE);
        if (effect.success()) {
            target.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    
    @Override
    protected String describe() {
        return "использует FlashCanon";
    }
}