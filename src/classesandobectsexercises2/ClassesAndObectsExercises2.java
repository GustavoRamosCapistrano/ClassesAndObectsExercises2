/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobectsexercises2;

/**
 *
 * @author Gustavo
 */
public class ClassesAndObectsExercises2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Class");
        
        Car car1 = new Car("Ford", "Focus", 4, "Silver");
        car1.drive("forward");

        Car car2 = new Car("Honda", "Civic", 4 , "Yellow");
        car2.drive(90);

    }
    
}
