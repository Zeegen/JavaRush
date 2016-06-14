package com.javarush.test.level14.lesson06.home01;

/**
 * Created by dogy on 14.06.16.
 */
public abstract class Hen implements Country
{
    abstract int getCountOfEggsPerMonth();
     String getDescription(){ return "Я курица."}
}
