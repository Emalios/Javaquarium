package fr.emalios.javaquarium;

import java.util.ArrayList;
import java.util.List;

public class FishHandler
{

    private List<Fish> fishs;

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
}
