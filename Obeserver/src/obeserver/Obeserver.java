/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obeserver;

/**
 *
 * @author ehdaaabdallah
 */
public class Obeserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ICourse course = new ICourse() ;
        
        OnlineStudent student = new OnlineStudent();
        OnlineCourses courses= new OnlineCourses();
        
        courses.notifyStudents(" ");
        courses.removeStudent(student);
        
        
    }
         
            
        // TODO code application logic here
    
    
}
