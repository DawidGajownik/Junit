package pl.coderslab.tydzien2.z1enum;

public enum Genre {
    ACTION("Fast-paced, high-energy films often with physical stunts"),
    COMEDY("Films intended to make the audience laugh"),
    DRAMA("Films that focus on character development and an emotional journey"),
    HORROR("Films designed to scare and invoke fear in the audience"),
    SCI_FI("Films based on speculative or futuristic science and technology"),
    ROMANCE("Films centered on romantic relationships between characters");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public void displayDescription() {
        System.out.println(description);
    }
}
