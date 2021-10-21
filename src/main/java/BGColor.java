public enum BGColor {
    // 8 colors
    BLACK ("\u001B[40m"),
    RED ("\u001B[41m"),
    GREEN ("\u001B[42m"),
    YELLOW ("\u001B[43m"),
    BLUE ("\u001B[44m"),
    MAGENTA ("\u001B[45m"),
    CYAN ("\u001B[46m"),
    WHITE ("\u001B[47m"),
    DEFAULT ("\u001B[49m"),
    // 16 colors
    BRIGHT_BLACK ("\u001B[40;1m"),
    BRIGHT_RED ("\u001B[41;1m"),
    BRIGHT_GREEN ("\u001B[42;1m"),
    BRIGHT_YELLOW ("\u001B[43;1m"),
    BRIGHT_BLUE ("\u001B[44;1m"),
    BRIGHT_MAGENTA ("\u001B[45;1m"),
    BRIGHT_CYAN ("\u001B[46;1m"),
    BRIGHT_WHITE ("\u001B[47;1m");

    private final String color;

    BGColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
