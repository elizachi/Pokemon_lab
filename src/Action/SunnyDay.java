package Action;

import ru.ifmo.se.pokemon.*;

public class SunnyDay extends StatusMove{
    public SunnyDay() { super(Type.FIRE, 0, 0); }
    @Override
    protected java.lang.String describe() { return "Sunny Day!" +
            "Сила атаки и скорость покемона будут увеличены на 3 очка в течение следующих 3 ходов. Здоровье будет восстановлено на 30 очков.";}
    protected void applySelfEffects(Pokemon self){
        Effect effect1 = new Effect().turns(3).stat(Stat.ATTACK, 3);
        self.addEffect(effect1);
        Effect effect2 = new Effect().turns(3).stat(Stat.SPEED, 3);
        self.addEffect(effect2);
    }
}
