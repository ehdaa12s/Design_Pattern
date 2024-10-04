/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.factory;

/**
 *
 * @author ehdaaabdallah
 */
public class ShapeFactory extends AbstractFactory {

  

    @Override
    IShape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")){
       return new Rectangle();
       }
       else if (shapeType.equalsIgnoreCase("Circle"))
       {
       return new Circle();}
       else if (shapeType.equalsIgnoreCase("Square"))
       {
       return new Square();}
       return null;
    }

    @Override
    IColor getColor(String colorType) {
      return null;
    }
    
    
}
