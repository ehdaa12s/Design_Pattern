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
public class MissionpLan  implements IMessage{
  private List<IMessage> messages;

    public MissionpLan(List<IMessage> messages) {
        this.messages = messages;
    }
  
  
    @Override
    public String getType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void addMessageToMissionPlan(IMessage  message) {
      messages.add(message);
    }
  public void removeMessageFromMissionPlan(IMessage  message) {
      messages.remove(0);
  }
       
    
}
