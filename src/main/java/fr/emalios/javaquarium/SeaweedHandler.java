package fr.emalios.javaquarium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeaweedHandler
{

    private int seaweeds;

    public SeaweedHandler()
    {
        this.seaweeds = 0;
    }

    public void addSeaweed(int number)
    {
        this.seaweeds += number;
    }

    @Override
    public String toString() {
        return this.seaweeds + " algues";
    }
}
