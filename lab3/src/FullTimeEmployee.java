/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class FullTimeEmployee extends Employee{
    float salary;

    public FullTimeEmployee(float salary, String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {
        super(employee_ID, employee_name, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
   

    @Override
    public String getInfo() {
       return this.toString();
    }

    @Override
    public float getPayment() {
      return salary;
    }

    @Override
    public String toString() {
        return super.toString()+" FullTimeEmployee{" + "salary=" + salary + '}';
    }


    
}
