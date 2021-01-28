package com.mycompany.app.Aufgabenblatt5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.mycompany.app.Aufgabenblatt5.Box;
import com.mycompany.app.Aufgabenblatt5.BoxEmptyException;
import com.mycompany.app.Aufgabenblatt5.FullBox;
import com.mycompany.app.Aufgabenblatt5.NotEnoughMoneyException;
import com.mycompany.app.Aufgabenblatt5.UnlimitedCashBox;
import com.mycompany.app.Aufgabenblatt5.VendingMachineImpl;


public class VendingMachineImplTest {

    @Mock
    private VendingMachineImpl vendingMachine;


    @Test
    public void testEnoughMoneyFullBox() throws BoxEmptyException, NotEnoughMoneyException {
        UnlimitedCashBox unlimitedCashBox = new UnlimitedCashBox();
        FullBox fullBox1 = new FullBox();
        FullBox fullBox2 = new FullBox();
        Box[] boxArray = {fullBox1, fullBox2};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);

        vendingMachine.selectItem(1);

    }
}