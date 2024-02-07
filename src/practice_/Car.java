/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_;

import static java.time.Instant.now;
import static java.time.Instant.now;

/**
 *
 * @author Student
 */
class Car {
    // Attributes.0
    private String color;
    private String model;
    private int speed;
    
    //Constructor
    public Car(String color, String model) {
        
        this.color = color;
        this.model = model;
        this.speed = 0; // Default speed is 0
        
    }
    
    
    //Method to accelerate the car
    public void accelerate(int increase) {
        speed += increase;
        System.out.println("The " + color + " " + model + "is now moving at a speed of "  + speed + "km/h.");
                        
    }
}
