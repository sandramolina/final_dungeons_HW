package players;

public enum Spells {
    CHROMATIC_ORB("Acid", 12),
    ACID_SPLASH("Acid", 10),
    BLIGHT("Necrotic", 15),
    WEIRD("Psychic", 8);

    private final String effect;
    private final int effectImpact;

    Spells(String effect, int effectImpact) {
        this.effect = effect;
        this.effectImpact = effectImpact;
    }
}
