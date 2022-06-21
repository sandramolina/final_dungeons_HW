package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard(80,"Albus", Spells.BLIGHT, GuardianForces.CACTUAR);
    }

    @Test
    public void getPlayerName() {
        assertEquals("Albus", wizard.getCharacterName());
    }

    @Test
    public void getHp() {
        assertEquals(80, wizard.getHp());
    }

    @Test
    public void setHp() {
        wizard.setHp(95);
        assertEquals(95, wizard.getHp());
    }

    @Test
    public void getSpell() {
        assertEquals(Spells.BLIGHT, wizard.getSpell());
    }

    @Test
    public void setSpell() {
        wizard.setSpell(Spells.ACID_SPLASH);
        assertEquals(Spells.ACID_SPLASH, wizard.getSpell());
    }

    @Test
    public void castSpell() {
        assertTrue(wizard.castSpell());
    }

    @Test
    public void hasGF(){
        assertEquals(GuardianForces.CACTUAR, wizard.getgF());
    }

    @Test
    public void canChangeGF(){
        wizard.setgF(GuardianForces.ELDEN);
        assertEquals(GuardianForces.ELDEN, wizard.getgF());
    }

    @Test
    public void canGetHealed() {
        Cleric cleric1 = new Cleric(35, "Pauline", HealingTools.RUE);
        wizard.getHealedByCleric(cleric1);
        assertEquals(83, wizard.getHp());
    }

    @Test
    public void getsDefendedByGF(){
        assertEquals("I will defend thee", wizard.getgF().gFDefends());
    }

    @Test
    public void spellGotEffect(){ assertEquals("Necrotic", wizard.getSpell().getEffect());}

    @Test
    public void spellGotImpact(){assertEquals(15, wizard.getSpell().getEffectImpact());}
}