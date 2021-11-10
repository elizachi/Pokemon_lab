package Action;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove{
    public FocusBlast() { super(Type.FIGHTING, 120, 70); }
    @Override
    protected java.lang.String describe() { return "Focus blast!" +
            "Атака наносит урон и с вероятностью 30% снижает защиту цели на 2 очка.";}
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int)damage);
    }
    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect().chance(0.3).stat(Stat.DEFENSE, -2);
        def.addEffect(effect);
    }
}
