package ru.otus.tasks.dz09;

public enum PlaceType {
    DENSE_FOREST("Густой лес"),
    FIELD("Равнина"),
    SWAMP("Болото");

    private final String place;

    PlaceType(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
