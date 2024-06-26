package com.java.tutorial;

import java.util.ArrayList;

public class Cake {
    private String flavor;
    private String size;
    private int layers;
    private ArrayList<String> ingredients;

    //default constructor
    public Cake(){}

    public Cake(String flavor, String size, int layers, ArrayList<String> ingredients){
        this.flavor = flavor;
        this.size = size;
        this.layers = layers;
        this.ingredients = ingredients;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public String setFlavor(String flavor)
    {
        return this.flavor = flavor;
    }

    public String getSize()
    {
        return size;
    }

    public String setSize(String size)
    {
        return this.size = size;
    }

    public int getLayers()
    {
        return layers;
    }

    public int setLayers(int layers)
    {
        return this.layers = layers;
    }

    public void addIngredients(String i)
    {
        ingredients.add(i);
    }

    public void removeIngredients(String i)
    {
        ingredients.remove(i);
    }

    public void printIngredients()
    {
        System.out.print("\nIngredients for the Cake : ");

        for(String ingredient : ingredients)
        {
            System.out.print("-" + ingredient);
        }
    }
}
