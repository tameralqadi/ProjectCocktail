/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcocktail;
import java.awt.Color;
/**
 *
 * @author M.T
 */
public abstract class Ingredient {
private String name; 
private double volume;
private double calories;
private Color color;


    public Ingredient(String name, double calories,double volume, Color color) {
        this.name = name;
        this.calories = calories;
        this.volume=volume;
        this.color = color;
    }

    public Ingredient() {
        
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
   
    
    public String getInfo() {
        return  "Name:" + getName() + "\nCalories:" + getCalories() + "\ncolor:" + getColor() + "\nVolume:" + getVolume();
    }
}
