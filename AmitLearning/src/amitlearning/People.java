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
public class People {
    private String firstName,lastName,email,mobile,address;
    private int id,age;
    private char gender;
    
    public void setData(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
        this.gender = gender;
    }
    public People(){
        firstName = "Unknown";
        lastName = "unknown";
        id = 0;
        age = 0;
        gender = '?';
        email = "unknown";
        mobile = "000000";
        address = "Unknown";
    }
    
    public People(int id,int age,String firstName,String lastName,String email,String mobile,String address,char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
        this.gender = gender;
    }
    public String getData(){
        return  "Id "+id+ System.lineSeparator() +"Name : "+firstName+" "+lastName
                + System.lineSeparator() +"Mobile "+mobile+System.lineSeparator() +"Address "+address
                +System.lineSeparator() +"Age "+age+System.lineSeparator() +"Email "+email+System.lineSeparator() +"Gender "+gender+System.lineSeparator();
    }
}
