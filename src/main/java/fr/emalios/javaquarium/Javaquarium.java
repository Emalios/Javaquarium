package fr.emalios.javaquarium;

import fr.emalios.javaquarium.utils.Gender;

public class Javaquarium
{

    public static void main(String[] args)
    {
        Aquarium aquarium = new Aquarium();
        aquarium.addSeaweed();
        aquarium.addFish("Hugo", Gender.MALE);
        aquarium.addTurn();
    }

}
