package players;

public enum WeaponType {
    DAGGER("Melee", 12, "piercing"),
    MACE("Melee", 10, "bludgeoning"),
    DART("Ranged", 12, "piercing"),
    SLING("Ranged", 10, "bludgeoning");

    private final String type;
    private final int damage;
    private final String damageType;

    WeaponType(String type, int damage, String damageType) {
        this.type = type;
        this.damage = damage;
        this.damageType = damageType;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public String getDamageType() {
        return damageType;
    }
}
