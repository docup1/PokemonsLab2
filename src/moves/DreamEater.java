package moves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    final static Type TYPE = Type.PSYCHIC;
    final static double POWER = 100.0;
    final static double ACCURACY = 1.0;
    final static int PRIORITY = 0;
    final static int HITS = 1;

    public DreamEater() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected void applyOppDamage(Pokemon var1, double var2) {
        if (var1.getCondition().equals(Status.SLEEP)) {
            var1.setMod(Stat.HP, (int)Math.round(var2));
        }
    }
    
    @Override
    protected void applySelfDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, -((int) Math.round(var2 * 0.5)));
    }
    
    @Override
    protected String describe() {
        return "использует DreamEater";
    }
}