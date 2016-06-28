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
public class Kia extends CarDetails {
    
    public static final int carSpeed = 220;
    public final String carType = "Automatic";
    public static int carPrice = 190000;
    
    @Override
    public void setDetails(String carName,String carModel,int carCC,int carProductionYear){
        super.setDetails(carName, carModel, carCC, carProductionYear);
    }

    @Override
    public String carType() {
        return "Car type "+carType;
    }
    public static int carPrice(){
        return carPrice;
    }
}
