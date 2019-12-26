package fr.emalios.javaquarium.fish;

import fr.emalios.javaquarium.utils.Name;

public enum FishSpecies
{

    MEROU("Mérou", FishType.CARNIVORY),
    THON("Thon", FishType.CARNIVORY),
    POISSON_CLOWN("Poisson-Clown", FishType.CARNIVORY),
    SOLE("Sole", FishType.HERBIVORY),
    CARPE("Carpe", FishType.HERBIVORY),
    BAR("Bar", FishType.HERBIVORY);

    private Name name;
    private FishType fishType;

    FishSpecies(String name, FishType fishType) {
        this.name = new Name(name);
        this.fishType = fishType;
    }

    public FishType type() {
        return this.fishType;
    }

    @Override
    public String toString() {
        return this.name + ";" + this.fishType;
    }
}
