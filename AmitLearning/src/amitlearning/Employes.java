/*
 * Coded by Mahmoud Gamal 23/6/2016
 * Feel free to using code 
 * Contact me mga599@gmail.com
 * http://www.github.com/mga599
 * Special thanks to Engineer Fady Samuel
 * Special thanks for AMIT Learning
 */
package amitlearning;

/**
 *
 * @author Mahmoud Gamal
 */
public class Employes extends People{
    private int jobDate,salary;
    private String role;
    
    
    public void setData(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender,String role, int jobDate, int salary){
       super.setData(id, age, firstName, lastName, email, mobile, address, gender);
       this.role = role;
       this.jobDate = jobDate;
       this.salary = salary;      
    }
    
    @Override
    public String getData(){
        return super.getData()+"Role "+role+ System.lineSeparator() +"Salary "+salary+ System.lineSeparator() +"Job Date "+jobDate;   
    }
    public Employes(){
        super();
        role = "Unknown";
        jobDate = 0000;
        salary = 0000;
    }
    public Employes(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender,String role,int jobDate,int salary){
        super(id, age, firstName, lastName, email, mobile, address, gender);
        this.role = role;
        this.jobDate = jobDate;
        this.salary = salary;
    }
}
