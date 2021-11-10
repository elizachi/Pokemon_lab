package Action;
import ru.ifmo.se.pokemon.*;

public class ShadowPunch extends PhysicalMove{
    public ShadowPunch() { super(Type.GHOST, 60, 100000000); }
    @Override
    protected java.lang.String describe() { return "Shadow punch!" +
            "Наносит урон и с вероятность 10% вводит противника в состояние 'сконфужен'";}
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int)damage);
    }
    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect().chance(0.1).turns(1);
        Effect.confuse(def);
        def.addEffect(effect);
    }
}
