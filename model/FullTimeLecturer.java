package model;

import interfaces.Payable;

public class FullTimeLecturer extends Lecturer implements Payable {

    public FullTimeLecturer(String name) {
        super(name);
    }

    @Override
    public double calculatePayment() {
        return 50000.00;
    }
}
