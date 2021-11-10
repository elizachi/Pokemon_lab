package Pokemons;

import Action.FirePunch;
import Action.FoulPlay;
import Action.LaserFocus;
import Action.ShadowPunch;
import ru.ifmo.se.pokemon.*;

public class Marshadow extends Pokemon {
    public Marshadow(String name, int level) {
        super(name, level);
        setLevel(15);
        setType(Type.GHOST, Type.FIGHTING);
        setMove(new FirePunch(), new ShadowPunch(), new LaserFocus(), new FoulPlay());
        setStats(90, 125, 80, 90, 90, 125);
    }
}
