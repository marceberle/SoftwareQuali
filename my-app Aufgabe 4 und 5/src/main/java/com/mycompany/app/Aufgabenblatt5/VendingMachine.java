package com.mycompany.app.Aufgabenblatt5;

public interface VendingMachine {

    public void selectItem(int boxIndex) throws
            NotEnoughMoneyException,
            BoxEmptyException;

}