package players;

import behaviours.Healable;
import behaviours.IFight;

public class Warrior extends Player implements Healable, IFight {
    private WeaponType weapon;

    public Warrior(int hp, String characterName, WeaponType weapon) {
        super(hp, characterName);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public void getHealedByCleric(Cleric cleric) {
        setHp(getHp() + cleric.getHealingTool().getPower());
    }

    @Override
    public String attack() {
        return "Attack!";
    }

    @Override
    public String defend() {
        return "Defend!";
    }
}
