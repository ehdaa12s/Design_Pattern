/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stratagy;

import java.util.List;

/**
 *
 * @author ehdaaabdallah
 */
public class Shopping {
    private List<Item>items;

    public Shopping(List<Item> items) {
        this.items = items;
    }
    
    void addItem(Item items) {
        this.items.add(items);
    }
    void removeItem(Item items){
        this.items.remove(0);
        
    }
    void calculatePriceForItems(){
        int sum=0;
        for(Item item :items){
            sum+=item.getPrice();
        }
    }
    
}
