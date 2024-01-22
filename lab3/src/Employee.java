/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public abstract class Employee {
    String employee_ID;
    String employee_name;
    int yearOfBirth;
    String address;
    String phone;

    public Employee(String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {
        this.employee_ID = employee_ID;
        this.employee_name = employee_name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }
    public Employee(){
        
    }

    public String getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(String employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" + "employee_ID=" + employee_ID + ", employee_name=" + employee_name + ", yearOfBirth=" + yearOfBirth + ", address=" + address + ", phone=" + phone + '}';
    }
    
   public abstract String getInfo();
   public abstract float getPayment();
}
