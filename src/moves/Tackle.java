package moves;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    private final static Type TYPE = Type.NORMAL    ;
    private final static double POWER = 40.0;
    private final static double ACCURACY = 1.00;
    private final static int PRIORITY = 0;
    private final static int HITS = 1;

    public Tackle() {
        super(TYPE, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override
    protected String describe() {
        return "использует Tackle";
    }
}