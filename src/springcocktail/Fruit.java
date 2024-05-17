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
public class Fruit extends Ingredient{

    public Fruit(String name, double calories, double volume, Color color) {
        super(name, calories, volume, color);
    }

    public Fruit() {
        
    }
    
    @Override
    public String getInfo() {
        return "Fruit\n" + super.getInfo();
    }
}
