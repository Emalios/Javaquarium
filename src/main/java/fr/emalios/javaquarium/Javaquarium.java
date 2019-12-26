package fr.emalios.javaquarium;

import fr.emalios.javaquarium.fish.Fish;
import fr.emalios.javaquarium.fish.FishSpecies;
import fr.emalios.javaquarium.fish.FishType;
import fr.emalios.javaquarium.utils.Gender;

public class Javaquarium
{

    public static void main(String[] args)
    {
        Aquarium aquarium = new Aquarium();
        aquarium.addSeaweed(10);
        aquarium.addFish(new Fish("Hugo", Gender.MALE, FishSpecies.MEROU));
        aquarium.addFish(new Fish("Tom", Gender.MALE, FishSpecies.MEROU));
        aquarium.addTurn();
    }

}
