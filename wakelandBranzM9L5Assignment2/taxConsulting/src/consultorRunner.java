/*
 * Wakeland Branz
 * Date: 1/10/2024
 * Seaforth High School
 *
 * Description:  Streamlines the process of gathering and reporting data about a tax consultation to a user.
 * Difficulties:  I had to restructure my CConsultation class a few times to make it more effective and readable, but it worked as soon as I did so.
 * What I Learned:  Proper class structuring for easy comprehension and modification.
 */

import java.util.*;

class CConsultation {
    // instance variables

    private double hourlyRate;
    private double consultingTime;
    private double income;
    private double consultingFee;

    private Scanner scanner;

    CConsultation(Scanner scanner) {
        this.hourlyRate = 0;
        this.consultingTime = 0;
        this.income = 0;
        this.consultingFee = 0;
        this.scanner = scanner;
    }

    // utility

    private void calculateConsultingFee() {
        double regularRate = (hourlyRate / 60.0) * consultingTime;

        if (income <= 25000.0) {
            if (consultingTime <= 30.0) {
                consultingFee = 0;
            }
            else {
                consultingFee = 0.5 * (regularRate - (hourlyRate / 60.0));
            }
        }
        else {
            if (consultingTime <= 20) {
                consultingFee = 0;
            }
            else {
                consultingFee = 0.75 * (regularRate - (hourlyRate / 60.0));
            }
        }
    }

    // processes consulations to avoid unnecessary tester code
    public void processConsulation() {
        inputHourlyRate();
        inputConsultingTime();
        inputIncome();
        calculateConsultingFee();

        System.out.printf("What is the consulting fee? %.2f\n", consultingFee);
    }

    // whether or not to loop the consultation process
    public boolean askAnotherCustomer() {
        System.out.print("Another customer (y/n)?");
        String response = scanner.next().trim().toLowerCase();
        return response.equals("y");
    }

    // user input

    private void inputHourlyRate() {
        System.out.print("What is the hourly rate? $");
        double hourlyRate = scanner.nextDouble();
        setHourlyRate(hourlyRate);
    }

    private void inputConsultingTime() {
        System.out.print("What is the consulting time? ");
        double consultingTime = scanner.nextDouble();
        setConsultingTime(consultingTime);
    }

    private void inputIncome() {
        System.out.print("What is the income? $");
        double income = scanner.nextDouble();
        setIncome(income);
    }

    // setters

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setConsultingTime(double consultingTime) {
        this.consultingTime = consultingTime;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setConsultingFee(double consultingFee) {
        this.consultingFee = consultingFee;
    }

    // getters

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getConsultingTime() {
        return consultingTime;
    }

    public double getIncome() {
        return income;
    }

    public double getConsultingFee() {
        return consultingFee;
    }
}

public class consultorRunner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        CConsultation consultation;

        do {
            consultation = new CConsultation(scanner);
            consultation.processConsulation();
        } while (consultation.askAnotherCustomer());

        System.out.println("Program terminated.");
    }
}

/* 
 * Sample output:
 * What is the hourly rate? $27
 * What is the consulting time? 45
 * What is the income? $45500
 * What is the consulting fee? 14.85
 * Another customer (y/n)?y
 * What is the hourly rate? $100
 * What is the consulting time? 50
 * What is the income? $100000
 * What is the consulting fee? 61.25
 * Another customer (y/n)?y 
 * What is the hourly rate? $30
 * What is the consulting time? 15
 * What is the income? $20000
 * What is the consulting fee? 0.00
 * Another customer (y/n)?n
 * Program terminated.
 */