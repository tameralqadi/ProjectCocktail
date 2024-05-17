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
public class Sugar extends Ingredient{
   private double weight;

    public Sugar(double weight, String name, double calories, double volume, Color  color) {
        super(name, calories, volume, color);
        this.weight = weight;
        setVolume(0);
    }

    public Sugar(double weight) {
        this.weight = weight;
    } 
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String getInfo() {
        return "Sugar" + "weight=" + weight+super.getInfo();
    }
}
