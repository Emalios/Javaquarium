package fr.emalios.javaquarium;

import fr.emalios.javaquarium.fish.Fish;
import fr.emalios.javaquarium.fish.FishHandler;
import fr.emalios.javaquarium.fish.FishType;
import fr.emalios.javaquarium.utils.Gender;
import fr.emalios.javaquarium.utils.Name;

public class Aquarium
{

    private FishHandler fishHandler;
    private SeaweedHandler seaweedHandler;

    public Aquarium()
    {
        this.fishHandler = new FishHandler();
        this.seaweedHandler = new SeaweedHandler();
    }

    public void addTurn()
    {
        System.out.println(this);
    }

    public void addFish(Fish fish)
    {
        this.fishHandler.add(fish);
    }

    public void addSeaweed(int number)
    {
        this.seaweedHandler.addSeaweed(number);
    }

    public void eatSeaweed()
    {
        this.seaweedHandler.addSeaweed(-1);
    }

    @Override
    public String toString() {
        return this.seaweedHandler.toString() +"\n" + this.fishHandler.toString();
    }

    public void eatFish(Fish fish) {
        fishHandler.eatFish(fish);
    }
}
