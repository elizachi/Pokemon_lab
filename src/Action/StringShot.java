package Action;

import ru.ifmo.se.pokemon.*;

public class StringShot extends StatusMove {
    public StringShot() { super(Type.BUG, 0, 95); }
    @Override
    protected java.lang.String describe() { return "String Shot!" +
            "Скорость противника снижена на 2 очка.";}
    protected void applyOppEffects(Pokemon def){
        Effect effect=new Effect().stat(Stat.SPEED, -2);
        def.addEffect(effect);
    }
}
