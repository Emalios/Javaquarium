package fr.emalios.javaquarium;

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

    public void addFish(String name, Gender gender)
    {
        this.fishHandler.add(new Fish(new Name(name), gender));
    }

    public void addSeaweed()
    {
        this.seaweedHandler.addSeaweed();
    }

    @Override
    public String toString() {
        return this.seaweedHandler.toString() +"\n" + this.fishHandler.toString();
    }
}
