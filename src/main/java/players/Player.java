package players;

public abstract class Player {
   private int hp;
    private String characterName;

    public Player(int hp, String characterName) {
        this.hp = hp;
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
