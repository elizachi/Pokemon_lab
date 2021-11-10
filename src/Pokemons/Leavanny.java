package Pokemons;

import Action.ProtectedRest;
import Action.StringShot;
import Action.SunnyDay;
import Action.SwordDance;
import ru.ifmo.se.pokemon.Type;

public class Leavanny extends Swadroon{
    public Leavanny(String name, int level) {
        super(name, level);
        setLevel(25);
        setType(Type.BUG, Type.GRASS);
        setMove(new StringShot(), new SunnyDay(), new SwordDance(), new ProtectedRest());
        setStats(75, 103, 80, 70, 80, 92);
    }
}
