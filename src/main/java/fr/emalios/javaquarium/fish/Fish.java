package fr.emalios.javaquarium.fish;

import fr.emalios.javaquarium.Aquarium;
import fr.emalios.javaquarium.utils.Gender;
import fr.emalios.javaquarium.utils.Name;

public class Fish
{

    private FishType type;
    private Name name;
    private Gender gender;
    private FishSpecies species;

    public Fish(String name, Gender gender, FishSpecies species)
    {
        this.name = new Name(name);
        this.gender = gender;
        this.type = species.type();
        this.species = species;
    }

    public void eat(Aquarium aquarium)
    {
        if(this.type == FishType.HERBIVORY)
        {
            aquarium.eatSeaweed();
            return;
        }
        aquarium.eatFish(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Fish)
        {
            Fish fish = (Fish) obj;
            return fish.species == this.species && fish.name.equals(this.name) && fish.gender == this.gender;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ";" + this.gender + ";" + this.species;
    }
}
