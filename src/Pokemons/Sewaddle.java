package Pokemons;

import Action.ProtectedRest;
import Action.StringShot;
import ru.ifmo.se.pokemon.*;

public class Sewaddle extends Pokemon{
    public Sewaddle(String name, int level) {
        super(name, level);
        setLevel(15);
        setType(Type.BUG, Type.GRASS);
        setMove(new ProtectedRest(), new StringShot());
        setStats(45, 53, 70, 40, 60, 42);
    }
}
