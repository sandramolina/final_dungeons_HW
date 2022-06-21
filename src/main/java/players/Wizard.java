package players;

import behaviours.Healable;

public class Wizard extends Player implements Healable {
    Spells spell;
    GuardianForces gF;

    public Wizard(int hp, String playerName, Spells spell, GuardianForces gF) {
        super(hp, playerName);
        this.spell = spell;
        this.gF = gF;
    }

    public Spells getSpell() {
        return spell;
    }

    public void setSpell(Spells spell) {
        this.spell = spell;
    }

    public boolean castSpell() {
        return true;
    }

    public GuardianForces getgF() {
        return gF;
    }

    public void setgF(GuardianForces gF) {
        this.gF = gF;
    }

    @Override
    public void getHealedByCleric(Cleric cleric) {
        setHp(getHp() + cleric.getHealingTool().getPower());
    }
}
