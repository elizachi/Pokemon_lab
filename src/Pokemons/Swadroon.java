package Pokemons;

import Action.ProtectedRest;
import Action.StringShot;
import Action.SunnyDay;
import ru.ifmo.se.pokemon.Type;

public class Swadroon extends Sewaddle{
    public Swadroon(String name, int level) {
        super(name, level);
        setLevel(20);
        setType(Type.BUG, Type.GRASS);
        setMove(new StringShot(), new SunnyDay(), new ProtectedRest());
        setStats(55, 63, 90, 50, 80, 42);
    }
}
