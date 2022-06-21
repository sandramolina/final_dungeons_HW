package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {
    Cleric cleric;

    @Before
    public void before(){ cleric = new Cleric(55, "Merlin", HealingTools.LICORICE);}

    @Test
    public void getCharacterName() {
        assertEquals("Merlin", cleric.getCharacterName());
    }

    @Test
    public void getHp() {
        assertEquals(55, cleric.getHp());
    }

    @Test
    public void setHp() {
        cleric.setHp(85);
        assertEquals(85, cleric.getHp());
    }

    @Test
    public void setHealingTool() {
        cleric.setHealingTool(HealingTools.RUE);
        assertEquals(HealingTools.RUE, cleric.getHealingTool());
    }

    @Test
    public void getHealingTool() {
        assertEquals(HealingTools.LICORICE, cleric.getHealingTool());
    }

    @Test
    public void healingToolGotPower(){
        assertEquals(5, cleric.getHealingTool().getPower());
    }

    @Test
    public void healingToolGotType(){
        assertEquals("Potion", cleric.getHealingTool().getToolType());
    }

    @Test
    public void canGetHealedByCleric(){
        Cleric cleric1 = new Cleric(35, "Pauline", HealingTools.RUE);
        cleric.getHealedBy(cleric1);
        assertEquals(58, cleric.getHp());
    }

//    @Test
//    public void canHeal(){
//        Cleric cleric1 = new Cleric(35, "Pauline", HealingTools.RUE);
//        cleric.heal(cleric1);
//        assertEquals(40, cleric1.getHp());
//    }

}