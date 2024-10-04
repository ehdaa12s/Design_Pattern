/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buldier;

/**
 *
 * @author ehdaaabdallah
 */
public class Employee {

    int employee;
    String name;
    String phone;
    String altrnativePhone;
    String address;

    static IEmoloyeeAccount getBulider() {
        return new EmployeeBuilder();
    }

}
