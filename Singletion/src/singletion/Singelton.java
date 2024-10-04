/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletion;

/**
 *
 * @author ehdaaabdallah
 */
public class Singelton {
    private static Singelton instance;
    private static int count;
    
    private Singelton(){}
    public static Singelton getInstance(){
        if(instance==null){
        instance= new Singelton();
        }
        count++;
        return instance;
    }
}
