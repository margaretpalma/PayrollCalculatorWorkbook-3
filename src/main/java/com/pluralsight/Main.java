package com.pluralsight;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilename = ConsoleHelper.promptForString("Enter the name of the employee file");
        String outputFilename = ConsoleHelper.promptForString("Enter the name of the payroll file to create");

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(inputFilename));
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(outputFilename));

            bufWriter.write("id|name|gross pay\n");

            String input;
            while ((input = bufReader.readLine()) != null) {
                Employee emp = makeEmployeeFromCode(input);
                bufWriter.write(emp.getEmployeeId() + "|" + emp.getEmployeeName() + "|" +
                        String.format("%.2f", emp.getGrossPay()) + "\n");
            }

            bufReader.close();
            bufWriter.close();

            System.out.println("Payroll file created successfully: " + outputFilename);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Employee makeEmployeeFromCode(String code) {
        String[] parts = code.split("\\|");

        int employeeId = Integer.parseInt(parts[0]);
        String employeeName = parts[1];
        float hoursWorked = Float.parseFloat(parts[2]);
        double payRate = Double.parseDouble(parts[3]);

        return new Employee(employeeId, employeeName, hoursWorked, payRate);
    }

    public static void displayEmployee(Employee e) {
        System.out.printf("%d %s worked %.1f hours at $%.2f/hr and earned $%.2f\n",
                e.getEmployeeId(), e.getEmployeeName(), e.getHoursWorked(), e.getPayRate(), e.getGrossPay());
    }
}
