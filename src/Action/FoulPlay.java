package Action;

import ru.ifmo.se.pokemon.*;

public class FoulPlay extends StatusMove {
    double variable = Math.random();
    public FoulPlay() { super(Type.DARK, 75, 100); }
    @Override
    protected java.lang.String describe() { return "Foul Play!" +
            "Marshadow крадёт 1 очко случайной хараткеристики противника 3 последующие хода.";}
    protected void applyOppEffects(Pokemon def){
        if(variable <= 1.99) {
            Effect effect1 = new Effect().turns(3).stat(Stat.ACCURACY, -1);
            def.addEffect(effect1);
        }
        else if(variable <= 3.98) {
            Effect effect2 = new Effect().turns(3).stat(Stat.ATTACK, -1);
            def.addEffect(effect2);
        }
        else if(variable <= 5.97) {
            Effect effect3 = new Effect().turns(3).stat(Stat.DEFENSE, -1);
            def.addEffect(effect3);
        }
        if(variable <= 7.96) {
            Effect effect4 = new Effect().turns(3).stat(Stat.EVASION, -1);
            def.addEffect(effect4);
        }
        else {
            Effect effect5 = new Effect().turns(3).stat(Stat.SPEED, -1);
            def.addEffect(effect5);
        }
    }
    protected void applySelfEffects(Pokemon self){
        if(variable <= 1.99) {
            Effect effect1 = new Effect().turns(3).stat(Stat.EVASION, 1);
            self.addEffect(effect1);
        }
        else if(variable <= 3.98) {
            Effect effect2 = new Effect().turns(3).stat(Stat.ATTACK, 1);
            self.addEffect(effect2);
        }
        else if(variable <= 5.97) {
            Effect effect3 = new Effect().turns(3).stat(Stat.DEFENSE, 1);
            self.addEffect(effect3);
        }
        if(variable <= 7.96) {
            Effect effect4 = new Effect().turns(3).stat(Stat.ACCURACY, 1);
            self.addEffect(effect4);
        }
        else {
            Effect effect5 = new Effect().turns(3).stat(Stat.SPEED, 1);
            self.addEffect(effect5);
        }
    }
}
