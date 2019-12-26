package fr.emalios.javaquarium.utils;

public enum LifePerThings
{

    SEAWEED(3),
    FISH(5),
    DAMAGE(-4);

    private int value;

    LifePerThings(int i) {
        this.value = i;
    }

    public int asInt() {
        return value;
    }
}
