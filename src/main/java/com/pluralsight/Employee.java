package com.pluralsight;

public class Employee {
    //variables
    private int employeeId;
    private String employeeName;
    private float hoursWorked;
    private double payRate;


    //constructor
    public Employee(int employeeId, String employeeName, float hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString(){
        return "{" +
                "\"employeeId\"=" + employeeId +
                ", \"name\"=" + employeeName + '\" +
               , \"hoursWorked\"=" + hoursWorked +
                ", \"payRate\"=" + payRate +
                '}';
    }
}
public double getGrossPay(){
    if (hoursWorked > 40){
        return (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
    }
    else{
        return hoursWorked * payRate;
    }
}

}