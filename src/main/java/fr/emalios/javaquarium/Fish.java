package fr.emalios.javaquarium;

import fr.emalios.javaquarium.utils.Gender;
import fr.emalios.javaquarium.utils.Name;

public class Fish
{

    private Name name;
    private Gender gender;

    public Fish(Name name, Gender gender)
    {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name + ";" + this.gender;
    }
}
