package Fight;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class PokemonBattle {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Marshadow("Marshadow", 25);
        Pokemon p2 = new Lickitung("Lickitung", 15);
        Pokemon p3 = new Lickilicky("Lickilicky", 20);
        Pokemon p4 = new Sewaddle("Sewaddle", 15);
        Pokemon p5 = new Swadroon("Swadroon", 20);
        Pokemon p6 = new Leavanny("Leavanny", 25);
        b.addAlly(p3);
        b.addAlly(p2);
        b.addAlly(p6);
        b.addFoe(p1);
        b.addFoe(p4);
        b.addFoe(p5);
        b.go();
    }
}
