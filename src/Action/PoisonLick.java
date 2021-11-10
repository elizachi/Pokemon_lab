package Action;

import ru.ifmo.se.pokemon.*;

public class PoisonLick extends SpecialMove {
    public PoisonLick() { super(Type.GHOST, 65, 100); }
    @Override
    protected java.lang.String describe() { return "Poison Lick!" +
            "Атака наносит урон и с вероятностью 20% может отравить цель.";}
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int)damage);
    }
    protected void applyOppEffects(Pokemon def) {
        Effect effect = new Effect().chance(0.2).turns(3);
        Effect.poison(def);
        def.addEffect(effect);
    }
}
