/*
 * Coded by Mahmoud Gamal 23/6/2016
 * Feel free to using code 
 * Contact me mga599@gmail.com
 * http://www.github.com/mga599
 * Special thanks to Engineer Fady Samuel
 * Special thanks for AMIT Learning
 */
package nonaccessmodifers;

/**
 *
 * @author Mahmoud Gamal
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create object
        Kia kia = new Kia();
        
        //Set data
        kia.setDetails("KIA", "Cerato", 1500, 2016);
        
        //final method
        System.out.println(kia.carDetails());
        
        //Normal methods
        System.out.println("Car motor cc "+kia.carCC());
        System.out.println("Year of production "+kia.carProductionYear());
        
        //calling using final from method
        System.out.println(kia.carType());
        
        //Calling using Static and final variable
        System.out.println("Car speed "+Kia.carSpeed);
        
        //Calling using Static method
        System.out.println("Car price "+Kia.carPrice());
    }
    
}
