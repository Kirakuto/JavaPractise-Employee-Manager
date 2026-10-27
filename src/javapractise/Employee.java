/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractise;

/**
 *
 * @author Izan
 */
public class Employee {
    
    private static int counter = 0;
    private final int id;
    
    private String fullName;
    private Department department;
    private double salary;
    private boolean active;

    public Employee(String fullName, Department department, double salary, boolean active) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.active = active;
    }
    public Employee() {
        this.id = counter++;
        this.active = true;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fullName=" + fullName + ", department=" + department + ", salary=" + salary + ", active=" + active + '}';
    }
    
    
}
