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
public class Students extends People {
    private int cost;
    private String paid,enrolledDate,courseName;
    
    public Students(){
        super();
        cost = 0;
        paid = "Unknown";
        enrolledDate = "Unknown";
        courseName = "Unknown";
    }
    public Students(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender,String enrolledDate, String courseName,String paid, int cost){
        super(id, age, firstName, lastName, email, mobile, address, gender);
        this.cost = cost;
        this.paid = paid;
        this.enrolledDate = enrolledDate;
        this.courseName = courseName;
    }
    public void setData(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender,String enrolledDate, String courseName,String paid, int cost){
        super.setData(id, age, firstName, lastName, email, mobile, address, gender);
        this.cost = cost;
        this.paid = paid;
        this.enrolledDate = enrolledDate;
        this.courseName = courseName;
    }
    @Override
    public String getData(){
        return super.getData()+"Course name "+courseName+System.lineSeparator() +"Cost "+cost+System.lineSeparator() +"Enrolled date "+enrolledDate+System.lineSeparator() +"Paid "+paid;
    }
}