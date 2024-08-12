package pl.coderslab.tydzien2.z2parametryzowanieTestówEnum;

import lombok.Getter;

@Getter
public enum AgeGroup {
    CHILD(0, 12),
    TEENAGER(13, 19),
    ADULT(20, 64),
    SENIOR(65, 120);

    private final int minAge;
    private final int maxAge;

    AgeGroup(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

}

