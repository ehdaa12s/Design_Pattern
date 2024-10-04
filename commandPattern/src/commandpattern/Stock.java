/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author ehdaaabdallah
 */
public class Stock {

    private String name = " Ami";

    private int quintity=10;

    public void buy() {
        System.out.println("Stock [ Name: " + name
                + " Quantity " + quintity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name
                + " Quantity " + quintity + " ] Sold");
    }
}
