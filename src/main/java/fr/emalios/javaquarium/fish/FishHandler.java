package fr.emalios.javaquarium.fish;

import fr.emalios.javaquarium.Aquarium;
import fr.emalios.javaquarium.fish.Fish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class FishHandler
{

    private List<Fish> fishs;
    private Random random;

    public FishHandler()
    {
        this.fishs = new ArrayList<>();
    }

    public void add(Fish fish)
    {
        this.fishs.add(fish);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder("Poissons :\n");
        for (Fish fish : this.fishs) {
            builder.append("-").append(fish).append("\n");
        }
        return builder.toString();
    }

    public void eatFish(Fish fish)
    {
        while(true)
        {
            Fish fishToEat = getFishToEat();
            if(!(fish.equals(fishToEat)))
            {
                killFish(fishToEat);
                break;
            }
        }
    }

    private void killFish(Fish fish)
    {
        this.fishs.remove(fish);
    }

    private Fish getFishToEat()
    {
        this.random = new Random();
        int random = this.random.nextInt(this.fishs.size());
        return this.fishs.get(random);
    }

    public void addTurn(Aquarium aquarium)
    {
        List<Fish> copy = new ArrayList<>(this.fishs);
        copy.forEach(fish -> {
            if (this.fishs.contains(fish)
            ) {
                fish.eat(aquarium);
            }
        });
    }
}
