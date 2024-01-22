/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class PartTimeEmployee extends Employee{
    int workingHour;
    float payRate;
    float payment;
    public PartTimeEmployee(int workingHour, float payRate, String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {
        super(employee_ID, employee_name, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString()+" PartTimeEmployee{" + "workingHour=" + workingHour + ", payRate=" + payRate + '}';
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public float getPayment() {
      payment=payRate*workingHour;
      return payment;
    }
    
}
