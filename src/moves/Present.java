package moves;

import ru.ifmo.se.pokemon.*;

public class Present extends PhysicalMove {
    private final static Type TYPE = Type.NORMAL;
    private final static double ACCURACY = 0.9;
    private final static double POWER = 0.0;
    private final static int PRIORITY = 0;
    private final static int HITS = 1;

    public Present() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        if (Math.random() < 0.5) {
            return 0;
        }
        double power = 40 + Math.random() * 80;
        return (0.4 * (double)var1.getLevel() + 2.0) * power / 150.0;
    }

    @Override
    protected void applyOppDamage(Pokemon opp, double damage) {
        if (damage == 1.0) {
            opp.setMod(Stat.HP, - ((int)Math.round(opp.getStat(Stat.HP) * 0.25)));
        } else {
            opp.setMod(Stat.HP, (int)Math.round(damage));
        }
    }

    @Override
    protected String describe() {
        return "использует Present";
    }
}