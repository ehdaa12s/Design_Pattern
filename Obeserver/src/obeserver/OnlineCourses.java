/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ehdaaabdallah
 */
public class OnlineCourses implements ICourse{
 private List<IStudent> enrolledStudents = new ArrayList<>();

    public OnlineCourses() {
        
    }

   

    void postLecture(String lectures) {

    }

 @Override
    public void enrollStudent(IStudent student) {
        
        enrolledStudents.add(student);
    }

 @Override
    public void removeStudent(IStudent student) {
        enrolledStudents.remove(student);
        
    }

 @Override
    public void notifyStudents(String lectures) {
        for ( IStudent student : enrolledStudents){
        student.update(lectures);
        }
    }

   
   

}
