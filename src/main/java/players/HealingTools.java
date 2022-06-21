package players;

public enum HealingTools {
    LICORICE("Potion", 5),
    MAGNOLIA("Herb", 2),
    RUE("Herb", 3),
    SEAHOLY("Potion", 5);
    ;

    private final String toolType;
    private final int power;

    HealingTools(String toolType, int power) {
        this.toolType = toolType;
        this.power = power;
    }

    public String getToolType() {
        return toolType;
    }

    public int getPower() {
        return power;
    }
}
