import org.jetbrains.annotations.NotNull;
import java.util.Objects;

public class Termicol {
    private static final String RESET = "\u001B[0m";

    private String text = "";
    private String foregroundColor = "";
    private String backgroundColor = "";
    private String textEffect = "";

    public Termicol() {
    }

    public Termicol(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getFG() {
        return foregroundColor;
    }

    public String getBG() {
        return backgroundColor;
    }

    public String getTextEffect() {
        return textEffect;
    }

    public Termicol setText(String text) {
        this.text = text;
        return this;
    }

    public Termicol setFG(@NotNull FGColor color) {
        foregroundColor = color.toString();
        return this;
    }

    public Termicol setFG(int r, int g, int b) {
        checkColor(r, g, b);
        foregroundColor = "\u001b[38;2;" + r + ";" + g + ";" + b + "m";
        return this;
    }

    public Termicol setDefaultFG() {
        foregroundColor = FGColor.DEFAULT.toString();
        return this;
    }

    public Termicol setBG(@NotNull BGColor color) {
        backgroundColor = color.toString();
        return this;
    }

    public Termicol setBG(int r, int g, int b) {
        checkColor(r, g, b);
        backgroundColor = "\u001b[48;2;" + r + ";" + g + ";" + b + "m";
        return this;
    }

    public Termicol setDefaultBG() {
        backgroundColor = BGColor.DEFAULT.toString();
        return this;
    }

    public Termicol setEffect(@NotNull Effect effect) {
        textEffect += effect;
        return this;
    }

    public Termicol reset() {
        foregroundColor = "";
        backgroundColor = "";
        textEffect = "";
        System.out.print(RESET);
        return this;
    }

    public void print() {
        System.out.print(backgroundColor + foregroundColor + textEffect + text);
    }

    public void printAndReset() {
        System.out.print(backgroundColor + foregroundColor + textEffect + text + RESET);
    }

    public void println() {
        System.out.println(backgroundColor + foregroundColor + textEffect + text);
    }

    public void printlnAndReset() {
        System.out.println(backgroundColor + foregroundColor + textEffect + text + RESET);
    }

    public void print(@NotNull String text) {
        System.out.print(backgroundColor + foregroundColor + textEffect + text);
    }

    public void printAndReset(@NotNull String text) {
        System.out.print(backgroundColor + foregroundColor + textEffect + text + RESET);
    }

    public void println(@NotNull String text) {
        System.out.println(backgroundColor + foregroundColor + textEffect + text);
    }

    public void printlnAndReset(@NotNull String text) {
        System.out.println(backgroundColor + foregroundColor + textEffect + text + RESET);
    }

    @Override
    public String toString() {
        return backgroundColor + foregroundColor + textEffect + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Termicol termicol = (Termicol) o;
        return Objects.equals(text, termicol.text) 
                && Objects.equals(foregroundColor, termicol.foregroundColor)
                && Objects.equals(backgroundColor, termicol.backgroundColor) 
                && Objects.equals(textEffect, termicol.textEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, foregroundColor, backgroundColor, textEffect);
    }
    
    public static void consoleReset() {
        System.out.print(RESET);
    }

    public static void consoleFG(@NotNull FGColor color) {
        System.out.print(color);
    }

    public static void consoleFG(int r, int g, int b) {
        checkColor(r, g, b);
        System.out.print("\u001b[38;2;" + r + ";" + g + ";" + b + "m");
    }

    public static void consoleDefaultFG() {
        System.out.print(FGColor.DEFAULT);
    }

    public static void consoleBG(@NotNull BGColor color) {
        System.out.print(color);
    }

    public static void consoleBG(int r, int g, int b) {
        checkColor(r, g, b);
        System.out.print("\u001b[48;2;" + r + ";" + g + ";" + b + "m");
    }

    public static void consoleDefaultBG() {
        System.out.print(BGColor.DEFAULT);
    }

    public static void consoleEffect(@NotNull Effect effect) {
        System.out.print(effect);
    }

    private static void checkColor(int r, int g, int b) {
        if (r < 0 || r > 255) {
            throw new IllegalArgumentException("Red component must be in range 0 to 255.");
        }
        if (g < 0 || g > 255) {
            throw new IllegalArgumentException("Green component must be in range 0 to 255.");
        }
        if (b < 0 || b > 255) {
            throw new IllegalArgumentException("Blue component must be in range 0 to 255.");
        }
    }
}
