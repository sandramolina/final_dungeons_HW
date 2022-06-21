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

//    public void heal(Healable playerToBeHealed){
//        playerToBeHealed.getHealedByCleric(cleric);
//    }

    @Override
    public void getHealedByCleric(Cleric cleric) {
        setHp(getHp() + cleric.getHealingTool().getPower());
    }
}
