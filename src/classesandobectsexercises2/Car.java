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
        System.out.printf("the %s %s is driving at %f degrees", colour, make, direction);
    }
    public void drive(String direction){
        System.out.println("the " + colour + " " + make + "is driving " + direction);
    }
}
