public class OopsBannerApp {

    // Pattern for letter O
    public static String[] getOPattern() {
        String[] O = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
        return O;
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        String[] P = {
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
        return P;
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        String[] S = {
            "  ***** ",
            " *      ",
            " *      ",
            "  ***** ",
            "       *",
            "       *",
            "  ***** "
        };
        return S;
    }

    // Main method
    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Printing O O P S side by side
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}
