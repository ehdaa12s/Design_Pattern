/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buldier;

/**
 *
 * @author ehdaaabdallah
 */
public class Buldier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        IEmoloyeeAccount employeeBuilder= Employee.getBulider();
        Employee empl= employeeBuilder.setEmployee(1).setEmployeeAltPhone("456789").setEmployeeAddress("Minya").build();
        System.out.print(empl);
        
        
    }
    
}
