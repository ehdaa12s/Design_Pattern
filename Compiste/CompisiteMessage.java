/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compiste;

import java.util.List;

/**
 *
 * @author ehdaaabdallah
 */
public class CompisiteMessage implements IMessage {
  

    @Override
    public String getType(String type) {
        return type="compiste Message";
    }

    @Override
    public String getId(String id) {
        
        return id="345";
        
    }
    
}
