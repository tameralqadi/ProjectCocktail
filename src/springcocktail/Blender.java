/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcocktail;
import java.util.ArrayList;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M.T
 */
public class Blender {

    private static double capacity = 1200;
    private ArrayList<Ingredient> ingredients;
    private Color color;
    private static double totalVolume;
    private double calories;

    public Blender( ArrayList<Ingredient> ingredients) {
        
        this.ingredients = new ArrayList<>();
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
//    public Color getColorName(){
//        int r = 0,g=0,b=0;
//        for (int i=0;i<ingredients.size();i++) {
//            r+=ingredients.get(i).getColor().getRed();
//            g+=ingredients.get(i).getColor().getGreen();
//            b+=ingredients.get(i).getColor().getBlue();
//             
//        }
//        r/=ingredients.size();
//        g/=ingredients.size();
//        b/=ingredients.size();
//        Color color=new Color(r,g,b);
//        return color;
//        
//    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getTotalVolume() {
        return this.totalVolume;
    }

    public void setTotalVolume(double v) {
        this.totalVolume = v;
    }

    public void addIngredients(Ingredient ingredient) throws BlenderOverFlowException {
        if (Blender.totalVolume+ingredient.getVolume() <= Blender.capacity) {
            ingredients.add(ingredient);
            Blender.totalVolume = totalVolume + ingredient.getVolume();

        } else {
            System.out.println(Blender.totalVolume + " " + Blender.capacity);
            throw new BlenderOverFlowException();
        }
    }

    public Color getFinalColor() {
        int r = 0, g = 0, b = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            r += ingredients.get(i).getColor().getRed();
            g += ingredients.get(i).getColor().getGreen();
            b += ingredients.get(i).getColor().getBlue();
        }
        
        int s = ingredients.size();
        
        Color c= new Color(r / s, g / s, b / s);
        return  c;
       
        
    }

    public double getTotalCalories() {
        double totalcalories = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            totalcalories += ingredients.get(i).getCalories();
        }
        return totalcalories;
    }

    public void blend() {
        getTotalCalories();
        getFinalColor();
       // return new Cocktail(getTotalCalories(), ingredients);
    }

    public void pourIntoCup(Cup cup) throws BlenderEmptyException {
            cup.pour(this);

    }

    public String getInfo() {
        String g = "Blender capacity=" + getCapacity() + "\ningredients=";
        for (int i = 0; i < ingredients.size(); i++) {
            g += (ingredients.get(i).getInfo());
        }
        return g;
    }
}
