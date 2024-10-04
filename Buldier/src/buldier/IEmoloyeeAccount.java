/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package buldier;

/**
 *
 * @author ehdaaabdallah
 */
public interface IEmoloyeeAccount {

    /**
     *
     * @return
     */
    Employee build();
    
    
    IEmoloyeeAccount setEmployee(int employee);

    IEmoloyeeAccount setEmployeeName(String name);

    IEmoloyeeAccount setEmployeePhone(String phone);

    IEmoloyeeAccount setEmployeeAltPhone(String altrnativePhone);

    IEmoloyeeAccount setEmployeeAddress(String address);

}
