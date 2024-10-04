/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.factory;

/**
 *
 * @author ehdaaabdallah
 */
public class ColorFactory  extends AbstractFactory{

    @Override
    public IColor getColor(String colorType) {
        if (colorType.equalsIgnoreCase("RED")){
       return new Red();
       }
       else if (colorType.equalsIgnoreCase("GREEN"))
       {
       return new Green();}
       else if (colorType.equalsIgnoreCase("BLUE"))
       {
       return new Blue();}
       return null;
    }

    @Override
    IShape getShape(String shapeType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
}

