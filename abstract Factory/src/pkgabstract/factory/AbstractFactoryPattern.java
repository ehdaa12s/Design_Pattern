/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract.factory;

import java.util.Scanner;

/**
 *
 * @author ehdaaabdallah
 */
public class AbstractFactoryPattern {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFactory shapeFactory=FactoryProducer.getFactory(false);
        IShape shape= shapeFactory.getShape("Rectangle");
        shape.draw();
         IShape shape1= shapeFactory.getShape("Circle");
        shape.draw();
         IShape shape2= shapeFactory.getShape("Square");
        shape.draw();
        IColor color = shapeFactory.getColor("RED");
        color.fill();
        
        IColor color2 = shapeFactory.getColor("Green");
        color.fill();
        IColor color3 = shapeFactory.getColor("Blue");
        color.fill();
      
     
    }
    
}
