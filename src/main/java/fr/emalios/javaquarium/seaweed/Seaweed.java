package fr.emalios.javaquarium.seaweed;

import fr.emalios.javaquarium.LivingEntity;

public class Seaweed extends LivingEntity
{

    public Seaweed()
    {
        super();
    }

    @Override
    public void addTurn()
    {
        super.addLife(1);
    }

}
