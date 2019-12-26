package fr.emalios.javaquarium.fish;

import fr.emalios.javaquarium.Aquarium;
import fr.emalios.javaquarium.LivingEntity;
import fr.emalios.javaquarium.utils.Gender;
import fr.emalios.javaquarium.utils.LifePerThings;
import fr.emalios.javaquarium.utils.Name;

public class Fish extends LivingEntity
{

    private FishType type;
    private Name name;
    private Gender gender;
    private FishSpecies species;

    public Fish(String name, Gender gender, FishSpecies species)
    {
        super();
        this.name = new Name(name);
        this.gender = gender;
        this.type = species.type();
        this.species = species;
    }

    @Override
    public void addTurn() {
        super.addLife(-1);
    }

    public void eat(Aquarium aquarium)
    {
        if(this.type == FishType.HERBIVORY)
        {
            if(aquarium.hasEnoughSeaweed())
            {
                aquarium.eatSeaweed();
                super.addLife(LifePerThings.SEAWEED.asInt());
            }
            return;
        }
        if(aquarium.hasEnoughFish())
        {
            aquarium.eatFish(this);
            super.addLife(LifePerThings.FISH.asInt());
        }
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
        return this.name + ";" + this.gender + ";" + this.species + ";" + super.toString();
    }

    public boolean canEat(Fish fishToEat) {
        return this.species != fishToEat.species;
    }

    public void damageFish(Fish fishToDamage) {
        fishToDamage.addLife(LifePerThings.DAMAGE.asInt());
    }
}
