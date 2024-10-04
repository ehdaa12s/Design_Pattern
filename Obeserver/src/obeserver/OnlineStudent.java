/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeserver;

/**
 *
 * @author ehdaaabdallah
 */
public class OnlineStudent implements IStudent {
    String name;

 OnlineStudent(String name) {
        this.name = name;
    }

  

    @Override
    public void update(String lectures) {
        System.out.println(name +" is updated");
    }
    
    
    
}
