/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobectsexercises2;

/**
 *
 * @author Gustavo
 */
public class Car {
    String make;
    String model;
    int numWheels;
    String colour;
    
    public void drive(double direction){
        System.out.println(String.format("the %s %s is driving at %f degrees", colour, make, direction));
    }
}
