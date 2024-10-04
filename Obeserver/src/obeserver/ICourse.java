/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package obeserver;

/**
 *
 * @author ehdaaabdallah
 */
public interface ICourse {

    void enrollStudent(IStudent student);

    void removeStudent(IStudent student);

    void notifyStudents(String lectures);

}
