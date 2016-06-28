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
public abstract class CarDetails implements Car {
       private String carName,carModel;
       private int carCC,carProductionYear;
       
        
        public void setDetails(String carName,String carModel,int carCC,int carProductionYear){
            this.carCC = carCC;
            this.carProductionYear = carProductionYear;
            this.carName = carName;
            this.carModel = carModel;
        }
       
        @Override
        public final String carDetails(){
            return "Car name "+carName+System.lineSeparator()+"Car model "+carModel;
        }
 
        @Override
        public int carProductionYear(){
            return carProductionYear;
        }
        
        @Override
        public int carCC(){
            return carCC;
        }
}
