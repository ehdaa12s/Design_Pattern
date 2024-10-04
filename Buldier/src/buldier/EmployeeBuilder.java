/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package buldier;

/**
 *
 * @author ehdaaabdallah
 */
public class EmployeeBuilder implements IEmoloyeeAccount {

    Employee employe;

    EmployeeBuilder() {
        employe = new Employee();
    }

    @Override
    public Employee build(){
       /*if (employe.name == null || employe.name.isEmpty()) {
            throw new Exception();
        }
        if (employe.address != null && employe.address.isEmpty()) {
            if (employe.phone != null && employe.phone.isEmpty()) {
                throw new Exception();
            }
        }*/
        return employe;
    }

    @Override
    public IEmoloyeeAccount setEmployee(int employee) {
        employe.employee = employee;
        return this;
    }

    @Override
    public IEmoloyeeAccount setEmployeeName(String name) {
        employe.name = name;
        return this;
    }

    @Override
    public IEmoloyeeAccount setEmployeePhone(String phone) {
        employe.phone = phone;
        return this;
    }

    @Override
    public IEmoloyeeAccount setEmployeeAltPhone(String altrnativePhone) {
        employe.altrnativePhone = altrnativePhone;
        return this;
    }

    @Override
    public IEmoloyeeAccount setEmployeeAddress(String address) {
        employe.address = address;
        return this;
    }

}
