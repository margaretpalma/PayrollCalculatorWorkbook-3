package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

//path
        String filepath = "EmployeePayroll";

//bufferreader - closing file
//dont forget catch @ end
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {

            String line;

            while ((line = br.readLine()) != null) {

                //| delimiter

                String[] tokens = line.split("\\|");

                //parse. converting

                int employeeId = Integer.parseInt(tokens[0]);
                String employeeName = tokens[1];
                float hoursWorked = Float.parseFloat(tokens[2]);
                float payRate = Float.parseFloat(tokens[3]);

                //employee object

                Employee emp = new Employee(employeeId, employeeName, hoursWorked, payRate);

                //print
                System.out.printf("ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        emp.getEmployeeId(), emp.getEmployeeName(), emp.getGrossPay());
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }
        }
    }