package model;

import interfaces.Payable;

public class PartTimeLecturer extends Lecturer implements Payable {

    private int hours;
    private double rate;

    public PartTimeLecturer(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePayment() {
        return hours * rate;
    }
}
