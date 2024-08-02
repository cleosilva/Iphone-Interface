package models;

import interfaces.IPhone;

public class Phone implements IPhone {
    private String number;

    @Override
    public void call(String number) {
        this.number = number;
        System.out.println("Calling number " + number);
    }

    @Override
    public void hangUp() {
        System.out.println("Hanging up the call with number: " + number);
    }
}
