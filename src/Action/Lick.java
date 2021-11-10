package Action;
import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove{
    public Lick() { super(Type.GHOST, 40, 100); }
    @Override
    protected java.lang.String describe() { return "Lick!" +
            "Атака наносит урон и с вероятностью 10% может парализовать цель.";}
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int)damage);
    }
    protected void applyOppEffects(Pokemon def) {
        Effect effect = new Effect().chance(0.3).turns(1);
        Effect.paralyze(def);
        def.addEffect(effect);
    }
}
