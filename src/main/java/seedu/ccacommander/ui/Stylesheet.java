package seedu.ccacommander.ui;

public enum Stylesheet {
    LIGHT("LightTheme.css"),
    DARK("DarkTheme.css"),
    EXTENSION("Extensions.css");

    public static final String SUCCESS_MESSAGE = "Stylesheet switched to: %1$s.";

    public static final Stylesheet DEFAULT_STYLESHEET = DARK;

    private static final String DIRECTORY = "/view/";
    private final String path;

    Stylesheet(String path) {
        this.path = path;
    }

    /**
     * Creates a {@code Stylesheet} object given a {@code String}.
     *
     * If the given {@code String} does not match any of the stylesheets,
     * return the default stylesheet instead.
     */
    public static Stylesheet constructStylesheet(String stylesheetString) {
        for (Stylesheet stylesheet : Stylesheet.values()) {
            if (stylesheet.path.equals(stylesheetString)) {
                return stylesheet;
            }
        }
        return DEFAULT_STYLESHEET;
    }

    @Override
    public String toString() {
        return path;
    }

    public String getStylesheet()  {
        return getClass().getResource(DIRECTORY + path).toExternalForm();
    }
}
