public enum FGColor {
    // 8 colors
    BLACK ("\u001B[30m"),
    RED ("\u001B[31m"),
    GREEN ("\u001B[32m"),
    YELLOW ("\u001B[33m"),
    BLUE ("\u001B[34m"),
    MAGENTA ("\u001B[35m"),
    CYAN ("\u001B[36m"),
    WHITE ("\u001B[37m"),
    DEFAULT ("\u001B[39m"),
    // 16 colors
    BRIGHT_BLACK ("\u001B[30;1m"),
    BRIGHT_RED ("\u001B[31;1m"),
    BRIGHT_GREEN ("\u001B[32;1m"),
    BRIGHT_YELLOW ("\u001B[33;1m"),
    BRIGHT_BLUE ("\u001B[34;1m"),
    BRIGHT_MAGENTA ("\u001B[35;1m"),
    BRIGHT_CYAN ("\u001B[36;1m"),
    BRIGHT_WHITE ("\u001B[37;1m");

    private final String color;

    FGColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
