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
public class Instructors extends People {
    private String courseName,startDate,endDate,title;
    private int salary;
    
    public void setData(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender, String courseName, String startDate, String endDate, int salary, String title){
       super.setData(id, age, firstName, lastName, email, mobile, address, gender);
       this.courseName = courseName;
       this.startDate = startDate;
       this.endDate = endDate;
       this.salary = salary;      
       this.title = title;
    }
    
    @Override
    public String getData(){
        return "Title "+title+System.lineSeparator() +super.getData()+"Course name "+courseName+System.lineSeparator() +"Salary "+salary+System.lineSeparator() +"Start date "+startDate+System.lineSeparator() +"End date "+endDate;    
    }
    public Instructors(){
        super();
        startDate = "Unknown";
        courseName = "Unknown";
        endDate = "unknown";
        salary = 0000;
        title = "Unknown";
    }
    public Instructors(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender, String courseName, String startDate, String endDate, int salary, String title){
       super(id, age, firstName, lastName, email, mobile, address, gender);
       this.courseName = courseName;
       this.startDate = startDate;
       this.endDate = endDate;
       this.salary = salary; 
       this.title = title;
    }
}
