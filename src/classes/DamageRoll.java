package classes;

import enums.DamageType;

public class DamageRoll {
    private Dice dice;
    private DamageType damageType;
    private String source;

    public DamageRoll(Dice dice, DamageType damageType, String source) {
        this.dice = dice;
        this.damageType = damageType;
        this.source = source;
    }
    //gettery itp
}
