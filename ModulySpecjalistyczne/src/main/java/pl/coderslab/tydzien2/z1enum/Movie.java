package pl.coderslab.tydzien2.z1enum;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Movie {

    private String title;
    private Genre genre;
    private String director;

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        genre.displayDescription();
        System.out.println("Director: " + director);
    }
}
