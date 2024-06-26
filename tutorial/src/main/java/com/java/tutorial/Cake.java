package com.java.tutorial;

import java.util.ArrayList;

public class Cake {
    
    private String flavor;
    private String size;
    private int layers;
    private ArrayList<String>  ingredients;

    //default constructor is a methos in a class that creates an object
    public Cake(){ }

    public Cake(String flavor, String size, int layers) {
        this.flavor = flavor;
        this.size = size;//small; medium; large
        this.layers = layers;
        this.ingredients = new ArrayList<>();
    }

    public String getFlavor(){
       return flavor;
    }
    
    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public String getSize(){
        return size;
     }
     
     public void setSize(String size)
     {
          this.size = size;
     }

     public int getLayers(){
        return layers;
     }
     
     public void setLayers(int layers)
     {
        this.layers = layers;
     }

     public void addIngredients(String i)
     {
        ingredients.add(i);

     }

     public void removeIngredients(String i)
     {
        ingredients.remove(i);

     }



}
