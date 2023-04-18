package org.example;

public class MonthlyBill {
    private int months;
    private double[] billAmounts;

    public MonthlyBill(int months, double[] billAmounts) {
        this.months = months;
        this.billAmounts = billAmounts;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        if(months >= 6)
            this.months = months;
        else
            System.out.println("# of months must be at least 6!");
    }

    public double[] getBillAmounts() {
        return billAmounts;
    }

    public void setBillAmounts(double[] billAmounts) {
        this.billAmounts = billAmounts;
    }

    public double calculateAmountDue() {
        double total = 0;

        for(double amount : this.billAmounts) {
            total += amount;
        }
        return total;
    }

    public double calculateMonthlyAvg() {
        return calculateAmountDue() / this.months;
    }
}
