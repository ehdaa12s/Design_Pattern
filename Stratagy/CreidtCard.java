/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stratagy;

/**
 *
 * @author ehdaaabdallah
 */
public class CreidtCard implements IPayment {
String name ;
String cardNumber;
String password;

    public CreidtCard(String name, String cardNumber, String password) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    

    @Override
    public void pay(int amount) {
        System.out.print(amount);
    }
    
}
