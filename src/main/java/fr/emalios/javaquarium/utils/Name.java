package fr.emalios.javaquarium.utils;

public class Name
{

    private String name;

    public Name(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Name)
        {
            Name name = (Name) obj;
            return name.name.equals(this.name);
        }
        return false;
    }
}
