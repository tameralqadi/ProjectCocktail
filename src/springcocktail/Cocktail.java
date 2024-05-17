/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcocktail;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author M.T
 */
public class Cocktail {
    private double calories;
    ArrayList<Ingredient>ingredients;
    Color color;
    
    public Cocktail(){
    }
    public Cocktail(double calories, ArrayList<Ingredient> ingredients) {
        this.calories = calories;
        this.ingredients = ingredients;
       // this.color = color;
    }
    

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    public String getInfo() {
        return "Cocktail calories=" + calories + "\ningredients=" + ingredients + "\ncolor=" + color ;
    }
    
    
}
