package players;

import behaviours.Healable;
import behaviours.IFight;

public class Warrior extends Player implements Healable, IFight {
    private WeaponType weapon;

    public Warrior(int hp, String playerName, WeaponType weapon) {
        super(hp, playerName);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public void getHealed() {
        setHp(getHp() + 5);
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
