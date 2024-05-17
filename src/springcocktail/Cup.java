/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcocktail;

/**
 *
 * @author M.T
 */
public class Cup {
    private double capacity=200;
    private double calories;

    public Cup() {
    }
    

    public Cup(double capacity, double calories) {
        this.capacity = capacity;
        this.calories = calories;
    }
    
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
   public double getTotalCalories(){
       return calories/100 * capacity/100;
   }
   public void pour(Blender b) throws BlenderEmptyException{
       if(b.getTotalVolume() < this.capacity){
           throw new BlenderEmptyException();
       }
       else{
       double dif = b.getTotalVolume() - this.capacity;
       b.setTotalVolume(dif);
          // System.out.println(b.getTotalVolume());
       setCalories(b.getTotalCalories());
       double cal = b.getCalories() - getCalories();
       b.setCalories(cal);
       }
   }
    public String getInfo() {
        return "Cup:" + "capacity=" + capacity + "\ncalories=" + calories +"\nTotal calorise in cup=" +getTotalCalories();
    }
   
}
