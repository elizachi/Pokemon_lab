package Action;

import ru.ifmo.se.pokemon.*;

public class FirePunch extends PhysicalMove {
    public FirePunch() { super(Type.FIRE, 75, 100);}
    @Override
    protected java.lang.String describe() { return "Fire punch!" +
            "Наносит урон и с вероятность 10% может поджечь цель.";}
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int)damage);
    }
    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect().chance(0.1);
        Effect.burn(def);
        def.addEffect(effect);
    }
}
