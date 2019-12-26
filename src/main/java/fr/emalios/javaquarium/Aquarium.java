package fr.emalios.javaquarium;

import fr.emalios.javaquarium.fish.Fish;
import fr.emalios.javaquarium.fish.FishHandler;
import fr.emalios.javaquarium.seaweed.SeaweedHandler;

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
        seaweedHandler.addTurn();
        fishHandler.addTurn(this);
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
        this.seaweedHandler.killSeaweed();
    }

    @Override
    public String toString() {
        return this.seaweedHandler.toString() +"\n" + this.fishHandler.toString();
    }

    public void eatFish(Fish fish) {
        fishHandler.eatFish(fish);
    }

    public boolean hasEnoughSeaweed() {
        return this.seaweedHandler.hasEnough();
    }

    public boolean hasEnoughFish() {
        return this.fishHandler.hasEnough();
    }
}
