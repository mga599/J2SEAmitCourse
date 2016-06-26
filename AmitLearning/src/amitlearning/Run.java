/*
 * Coded by Mahmoud Gamal 23/6/2016
 * Feel free to using code 
 * Contact me mga599@gmail.com
 * http://www.github.com/mga599
 * Special thanks to Engineer Fady Samuel
 * Special thanks for AMIT Learning
 */
package amitlearning;


import java.util.Scanner;

/**
 *
 * @author Mahmoud Gamal
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make code running (into loop system->while) if inputs equal it's values
        boolean isRunning = true;
        //Code running while running = true
        while(isRunning){
        //Scanner to input data
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Employes 1 Instructors 2 Students 3 Exit any key ");
        //Mode to using if statement with chooseing of employes, instructors or students
        int mode =  dataInput.nextInt();
        
        //If statement to display
        if (mode==1){
            
            System.out.println("Default values 1 Overloading constractor 2 Setter 3 Arrays 4");    
            int choose = dataInput.nextInt();
            //Print new line = <br> in html
            System.out.println(System.lineSeparator());
            //Switch statement to display default, overloaded constractors
            switch (choose) {
                case 1:
                    {
                        //Default values
                        Employes employe = new Employes();
                        //Getters to get data
                        System.out.println(employe.getData());
                        break;
                    }
                case 2:
                    {
                        //Using overloaded
                        Employes employe = new Employes(1212, 30, "Haitham", "Abd Elsalam", "haitham@amit-learning.com", "0100122355", "Cairo", 'm', "Administrator", 2011, 5000);
                        //Getters to get data
                        System.out.println(employe.getData());
                        break;
                    }
                case 3:
                    {
                        //Using getters
                        Employes employe = new Employes();
                        //Setters to set data
                        employe.setData(1250, 25, "Islam", "Islam", "islam@amit-learning.com", "01215663211", "Giza", 'm', "Receptionist", 2015, 1450);
                        //Getters to get data
                        System.out.println(employe.getData());
                        break;
                    }
                case 4:
                    { 
                        //Using setters with arrays and Integer class to convert string to int
                        //Using .charAt to convert string to char
                        Employes employe = new Employes();
                        //Two dimensional array
                        String [][] employeArray = 
                        {
                            {"1212", "30", "Haitham", "Abd Elsalam", "haitham@amit-learning.com", "0100122355", "Cairo", "m", "Administrator", "2011", "5000"},
                            {"1250", "25", "Islam", "Islam", "islam@amit-learning.com", "01215663211", "Giza", "m", "Receptionist", "2015", "1450"}  
                        };
                        int r = 0;
                        //Using while loops
                        while (r<employeArray.length){
                            //Set data from array and convert strings to int and char
                            employe.setData(Integer.parseInt(employeArray[r][0]), Integer.parseInt(employeArray[r][1]), employeArray[r][2], employeArray[r][3], employeArray[r][4], employeArray[r][5], employeArray[r][6], employeArray[r][7].charAt(0), employeArray[r][8], Integer.parseInt(employeArray[r][9]), Integer.parseInt(employeArray[r][10]));                        
                            //Getters to get data
                            System.out.println(employe.getData()+System.lineSeparator());
                            r++;
                        }
                        break;
                    }
                default:
                        isRunning = false;
                        break;
            }
                    
        } else if (mode==2){
            
            System.out.println("Default values 1 Overloading constractor 2 Setter 3 Arrays 4");    
            int choose = dataInput.nextInt();
            System.out.println(System.lineSeparator());
            switch (choose) {
                case 1:
                    {
                        Instructors instructor = new Instructors();
                        System.out.println(instructor.getData());
                        break;
                    }
                case 2:
                    {
                        //Using overloaded
                        Instructors instructor = new Instructors(2598, 28, "Fady", "Samuel", "fadysamuel88@yahoo.com", "01156236995", "Maadi", 'm',"Java J2SE", "1-6-2016", "3-7-2016", 7400, "Eng");
                        //Getters to get data
                        System.out.println(instructor.getData());
                        break;
                    }
                case 3:
                    {
                        //Using setters to set data
                        Instructors instructor = new Instructors();
                        instructor.setData(3562, 32, "Mohammed", "Hamdy", "mohammedhamdy2000@gmail.com", "01029885233", "Helwan", 'm',"Andtoid 101", "1-5-2016", "10-8-2016", 9000, "Eng");
                        //Getters to get data
                        System.out.println(instructor.getData());
                        break;
                    }
                case 4:
                    {
                        //Using setters with arrays and Integer class to convert string to int
                        //Using .charAt to convert string to char
                        Instructors instructor = new Instructors();
                        //Two dimensional array
                        String [][] instructorsArray = 
                        {
                            {"2598", "28", "Fady", "Samuel", "fadysamuel88@yahoo.com", "01156236995", "Maadi", "m","Java J2SE", "1-6-2016", "3-7-2016", "7400", "Eng"},
                            {"3562", "32", "Mohammed", "Hamdy", "mohammedhamdy2000@gmail.com", "01029885233", "Helwan", "m","Andtoid 101", "1-5-2016", "10-8-2016", "9000", "Eng"}   
                        };
                        //Using for loops
                        for (int i=0; i<instructorsArray.length;i++){
                            //Set data from array and convert strings to int and char
                            instructor.setData(Integer.parseInt(instructorsArray[i][0]), Integer.parseInt(instructorsArray[i][1]), instructorsArray[i][2], instructorsArray[i][3], instructorsArray[i][4], instructorsArray[i][5], instructorsArray[i][6], instructorsArray[i][7].charAt(0), instructorsArray[i][8], instructorsArray[i][9], instructorsArray[i][10], Integer.parseInt(instructorsArray[i][11]), instructorsArray[i][12]);
                            //Getters to get data
                            System.out.println(instructor.getData()+System.lineSeparator());
                        }
                        break;
                    }
                default:
                        isRunning = false;
                        break;
            } 
    } else if (mode==3){
            
            System.out.println("Default values 1 Overloading constractor 2 Setter 3 Arrays 4");    
            int choose = dataInput.nextInt();
            System.out.println(System.lineSeparator());
            switch (choose) {
                case 1:
                    {
                        //Default values
                        Students student = new Students();
                        //Getters to get data
                        System.out.println(student.getData());
                        break;
                    }
                case 2:
                    {
                        //using overloaded
                        Students student = new Students(4920, 24, "Mahmoud", "Gamal", "mga599@gmail.com", "01023230560", "Minya", 'm', "30-5-2016", "Java J2SE", "yes", 1350);
                        System.out.println(student.getData());
                        break;
                    }
                case 3:
                    {
                        //Using setters
                        Students student = new Students();
                        student.setData(5460, 23, "Abd-ElRahman", "Ali", "abdelrahman2018@hotmail.com", "0169985223", "Helwan", 'm', "12-5-2016", "Java J2SE", "yes", 1350);
                         //Getters to get data
                        System.out.println(student.getData());
                        break;
                    }
                case 4:
                    {
                        //Using setters with arrays and Integer class to convert string to int
                        //Using .charAt to convert string to char
                        Students student = new Students();
                        //Two dimensional array
                        String [][] studentsArrays = 
                            {
                                {"4920", "24", "Mahmoud", "Gamal", "mga599@gmail.com", "01023230560", "Minya", "m", "30-5-2016", "Java J2SE", "yes", "1350"},
                                {"5460", "23", "Abd-ElRahman", "Ali", "abdelrahman2018@hotmail.com", "0169985223", "Helwan", "m", "12-5-2016", "Java J2SE", "yes", "1350"}
                            };
                        int q = 0;
                        //Using do while loops
                        do {
                            //Set data from array and convert strings to int and char
                            student.setData(Integer.parseInt(studentsArrays[q][0]), Integer.parseInt(studentsArrays[q][1]), studentsArrays[q][2], studentsArrays[q][3], studentsArrays[q][4], studentsArrays[q][5], studentsArrays[q][6], studentsArrays[q][7].charAt(0), studentsArrays[q][8], studentsArrays[q][9], studentsArrays[q][10], Integer.parseInt(studentsArrays[q][11]));
                            System.out.println(student.getData()+System.lineSeparator());
                            q++;
                        } while (q<studentsArrays.length);
                        break;
                    }
                default:
                       isRunning = false;
                       break;
            }
    } else {
        isRunning = false;     
    }
        if (isRunning) {
            System.out.println("Have a nice code");
        } else {
            System.out.println("See you later, bye");
        }
}
}
}
