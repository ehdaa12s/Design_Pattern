/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author ehdaaabdallah
 */
public class RectangleAdapter implements Square {
    private Rectangle rect;

    public RectangleAdapter(Rectangle rect) {
        this.rect = rect;
    }
    
   

    @Override
    public void setSide(int side) {
    this.rect.setLength(side);
    }
    @Override
    public void printAreaOfSquare() {
        this.rect.printAreaOfRectangle();
       
       
    }
    
}
