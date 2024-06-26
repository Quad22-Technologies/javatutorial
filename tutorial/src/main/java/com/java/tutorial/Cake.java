package com.java.tutorial;

import java.util.ArrayList;

public class Cake 
{   //default constructor

    private String flavor;
    private String size;
    private int layers;
    private ArrayList<String> ingredients;

    public Cake(String flavor, String size, int layers)
    {
       this.flavor = flavor;
       this.size = size;
       this.layers = layers;
       this.ingredients = new ArrayList<>();
    }    
public Cake() {
        //TODO Auto-generated constructor stub
    }
public String getFlavor()
{
    return flavor;
}

public void setFlavor(String flavor)
{
     this.flavor = flavor;
}

public String getSize()
{
    return size;
}

public void setSize(String size)
{
     this.size = size;
}

public int getLayers()
{
    return layers;
}

public void setLayers(int layers)
{
     this.layers = layers;
}

public void addIngredients(String i )
{
    ingredients.add(i);
}

public void removeIngredients(String i )
{
    ingredients.remove(i);
}

public ArrayList<String> getIngredients()
{
    return new ArrayList<> ingredients ;
}

public void printIngredients()
	{
		System.out.println("\nIngredients for the cake: "  );

		for(String ingredient : ingredients)
        {
            System.out.println("-" + ingredient);
        }
	}


}
