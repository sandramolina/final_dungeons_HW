package players;

public abstract class Player {
   private int hp;
    private String playerName;

    public Player(int hp, String playerName) {
        this.hp = hp;
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
