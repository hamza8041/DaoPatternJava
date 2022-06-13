package Models;

import java.util.ArrayList;
import java.util.List;

public class Employees extends Base{

    private String employeeName;
    private long employeeSalary;


    public Employees(int id, String employeeName, long employeeSalary) {
        super(id);
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}

