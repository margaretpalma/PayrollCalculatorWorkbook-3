package com.pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private float hoursWorked;
    private double payRate;

    public Employee(int employeeId, String employeeName, float hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getGrossPay() {
        if (hoursWorked > 40) {
            return (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
        } else {
            return hoursWorked * payRate;
        }
    }

    @Override
    public String toString() {
        return String.format("{\"employeeId\": %d, \"name\": \"%s\", \"hoursWorked\": %.2f, \"payRate\": %.2f}",
                employeeId, employeeName, hoursWorked, payRate);
    }
}
