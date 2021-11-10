package Action;

import ru.ifmo.se.pokemon.*;

public class SwordDance extends StatusMove{
    public SwordDance() { super(Type.NORMAL, 0, 0); }
    @Override
    protected java.lang.String describe() { return "Sword Dance!" +
            "Атака Leavanny увеличена на 2 очка следующие 2 хода.";}
    protected void applySelfEffects(Pokemon self){
        Effect effect=new Effect().stat(Stat.ATTACK, 2);
        self.addEffect(effect);
    }
}
