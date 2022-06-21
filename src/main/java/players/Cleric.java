package players;

import behaviours.Healable;

public class Cleric extends Player implements Healable {
    HealingTools healingTool;

    public Cleric(int hp, String characterName, HealingTools healingTool) {
        super(hp, characterName);
        this.healingTool = healingTool;
    }

    public void setHealingTool(HealingTools healingTool) {
        this.healingTool = healingTool;
    }

    public HealingTools getHealingTool() {
        return healingTool;
    }

    @Override
    public void getHealed() {
        setHp(getHp() + 1);
    }

    public String heal(){
        return "You are healed!";
    }
}
