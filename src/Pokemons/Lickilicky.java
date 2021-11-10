package Pokemons;

import Action.Lick;
import Action.FocusBlast;
import Action.PoisonLick;
import Action.ProtectedRest;
import ru.ifmo.se.pokemon.*;

public class Lickilicky extends Lickitung{
    public Lickilicky(String name, int level) {
        super(name, level);
        setLevel(25);
        setType(Type.NORMAL);
        setMove(new Lick(), new FocusBlast(), new PoisonLick(), new ProtectedRest());
        setStats(110, 85, 95, 80, 95, 50);
    }
}
