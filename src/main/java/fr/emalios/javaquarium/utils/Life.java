package fr.emalios.javaquarium.utils;

import java.util.List;

public class Life
{

    private int life;

    public Life(int life)
    {
        this.life = life;
    }

    public Life()
    {
        this.life = 10;
    }

    public boolean isDead()
    {
        return this.life <= 0;
    }

    public void addLife(int number)
    {
        this.life += number;
    }

    @Override
    public String toString() {
        return this.life + "pdv";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Life)
        {
            Life life = (Life) obj;
            return life.life == this.life;
        }
        return false;
    }

    public boolean isHungry() {
        return this.life <= 5;
    }
}
