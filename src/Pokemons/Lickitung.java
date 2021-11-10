package Pokemons;

import Action.Lick;
import Action.PoisonLick;
import Action.ProtectedRest;
import ru.ifmo.se.pokemon.*;

public class Lickitung extends Pokemon{
    public Lickitung(String name, int level) {
        super(name, level);
        setLevel(20);
        setType(Type.NORMAL);
        setMove(new Lick(), new PoisonLick(), new ProtectedRest());
        setStats(90, 55, 75, 60, 75, 30);
    }
}
