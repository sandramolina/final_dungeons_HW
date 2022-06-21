package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void before() {
        warrior = new Warrior(150,"Xiao",WeaponType.DAGGER);
    }

    @Test
    public void getPlayerName() {
        assertEquals("Xiao", warrior.getCharacterName());
    }

    @Test
    public void getHp() {
        assertEquals(150, warrior.getHp());
    }

    @Test
    public void setHp() {
        warrior.setHp(175);
        assertEquals(175, warrior.getHp());
    }

    @Test
    public void getWeapon() {
        assertEquals(WeaponType.DAGGER, warrior.getWeapon());
    }

    @Test
    public void setWeapon() {
        warrior.setWeapon(WeaponType.DART);
        assertEquals(WeaponType.DART, warrior.getWeapon());
    }

    @Test
    public void getHealed() {
        warrior.getHealed();
        assertEquals(155, warrior.getHp());
    }

    @Test
    public void canAttack(){
        assertEquals("Attack!", warrior.attack());
    }

    @Test
    public void canDefend(){
        assertEquals("Defend!", warrior.defend());
    }

}