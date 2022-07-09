package com.example.week8;

public class Employee {

    private String name;
    private String department;
    private String joining_date;
    private double salary;

    public Employee(String name, String department, String joining_date, double salary) {
        this.name = name;
        this.department = department;
        this.joining_date = joining_date;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", joining_date='" + joining_date + '\'' +
                ", salary=" + salary +
                '}';
    }
}
