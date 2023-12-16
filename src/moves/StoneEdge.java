package moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    private final static Type TYPE = Type.ROCK;
    private final static double POWER = 100.0;
    private final static double ACCURACY = 0.80;
    private final static int PRIORITY = 0;
    private final static int HITS = 1;

    public StoneEdge() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) / 512.0 * 3.0 > Math.random()) {
           System.out.println("Критический удар!");
           return 2.0;
        } else {
           return 1.0;
        }
     }

    @Override
    protected String describe() {
        return "использует StoneEdge";
    }
}