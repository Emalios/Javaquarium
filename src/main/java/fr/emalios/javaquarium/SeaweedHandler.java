package fr.emalios.javaquarium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Override
    public String toString() {
        return this.seaweeds.size() + " algues";
    }
}
