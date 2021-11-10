package Action;

import ru.ifmo.se.pokemon.*;

public class ProtectedRest extends StatusMove {
    public ProtectedRest() { super(Type.NORMAL, 0, 0); }
    @Override
    protected java.lang.String describe() { return "Protected Rest!" +
            "Всё живое погружается в сон на 1 ход. Атакующий покемон восстанавливает здоровье на 10 очков следующие два хода.";}
    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect().chance(1).turns(1);
        Effect.sleep(def);
        def.addEffect(effect);
    }
    protected void applySelfEffects(Pokemon self){
        Effect effect = new Effect().turns(2).stat(Stat.HP, 10);
        self.addEffect(effect);
    }
}
