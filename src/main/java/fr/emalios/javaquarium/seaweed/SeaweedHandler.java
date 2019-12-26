package fr.emalios.javaquarium.seaweed;

import fr.emalios.javaquarium.LivingEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SeaweedHandler
{

    private List<Seaweed> seaweeds;

    public SeaweedHandler()
    {
        this.seaweeds = new ArrayList<>();
    }

    public void addSeaweed(int number)
    {
        for (int i = 0; i < number; i++) {
            this.seaweeds.add(new Seaweed());
        }
    }

    public void killSeaweed()
    {
        this.seaweeds.remove(new Random().nextInt(this.seaweeds.size()));
    }

    @Override
    public String toString() {
        return this.seaweeds.size() + " algues";
    }

    public void addTurn() {
        this.seaweeds.forEach(Seaweed::addTurn);
    }

    public boolean hasEnough() {
        return this.seaweeds.size() >= 1;
    }
}
