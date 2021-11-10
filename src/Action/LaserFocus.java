package Action;

import ru.ifmo.se.pokemon.*;

public class LaserFocus extends SpecialMove {
    double variable = Math.random();
    public LaserFocus() { super(Type.NORMAL, 50, 100);}
    @Override
    protected java.lang.String describe() { return "LaserFocus!" +
            "Атака наносит урон. С вероятность 10% может ввести цель в состояние 'страх' и нанести дополнительный урон.\n" +
            "После нанесения дополнительного урона с вероятностью 50% Marshadow заснёт на 1 ход.";}
    protected void applyOppDamage(Pokemon def, double damage){
        if(variable <= 0.2){
            def.setMod(Stat.HP, (int)(damage + damage*variable));
        }
        else{
            def.setMod(Stat.HP, (int)damage);
        }
    }
    protected void applyOppEffects(Pokemon def) {
        if (variable <= 0.1) {
            Effect effect = new Effect();
            Effect.flinch(def);
            def.addEffect(effect);
        }
    }
    protected void applySelfEffects(Pokemon self){
        if(variable <= 0.1) {
            Effect effect = new Effect().chance(0.5).turns(1);
            Effect.sleep(self);
            self.addEffect(effect);
        }
    }
}
