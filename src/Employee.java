import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {

    private String name;
    private String surName;
    private String lastName;
    private double salary;
    private int id;
    private static int Counter;
    private int department;

    public Employee(int department, String name, String surName, String lastName, double salary) {
        this.department = department;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.lastName = lastName;
        this.id = ++Counter;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Работник : " +
                "ID - " + getId() +
                ", отдел " + getDepartment() +
                ", имя - '" + getName() + '\'' +
                ", фамилия - " + getSurName() + '\'' +
                ", отчество - " + getLastName() + '\'' +
                ", зарплата - " + getSalary();

    }


}
