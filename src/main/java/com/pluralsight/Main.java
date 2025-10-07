package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {

//bufferreader - closing file
//dont forget catch @ end
        try {

            FileReader fileReader = new FileReader("payroll.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);

            String input;
            while ((input = buffReader.readLine()) != null) {
                Employee emp = makeEmployeeFromCode(input);
                displayEmployee(emp);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static Employee makeEmployeeFromCode(String code) {
        String[] info = code.split("\\|");

        int employeeId = Integer.parseInt(info[0]);
        String name = info[1];
        float hoursWorked = Float.parseFloat(info[2]);
        double payRate = Double.parseDouble(info[3]);

        return new Employee(employeeId, name, hoursWorked, payRate);
    }

    public static void displayEmployee(Employee e) {
        System.out.printf("%d %s worked %.1f hours at a rate of $%.2f, earned $.2f\n", e.getEmployeeId(), e.getEmployeeName(), e.getHoursWorked(), e.getPayRate(), e.getGrossPay());

    }
}