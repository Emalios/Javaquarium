package fr.emalios.javaquarium;

import fr.emalios.javaquarium.utils.Life;

public class LivingEntity
{

    private Life life;

    public LivingEntity()
    {
        this.life = new Life();
    }

    public boolean isHungry()
    {
        return life.isHungry();
    }

    public void addTurn() {
        this.life.addLife(1);
    }

    protected void addLife(int number)
    {
        this.life.addLife(number);
    }

    public boolean isDead()
    {
        return this.life.isDead();
    }

    @Override
    public String toString() {
        return this.life.toString();
    }
}
