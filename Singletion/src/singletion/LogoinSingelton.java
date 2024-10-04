/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletion;

/**
 *
 * @author ehdaaabdallah
 */
public class LogoinSingelton {
    private static  LogoinSingelton instance ;
   
    private LogoinSingelton(){}
    public static LogoinSingelton getInstance(){
        if(instance== null ){
            instance= new LogoinSingelton();
        }
        return instance;
    }
    public String  insert( String userName, String passoword ){
        return ( " username is "+ userName + " passoword is "+ passoword);
    }
    
}
