package com.mycompany.app.Aufgabenblatt5;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.Aufgabenblatt5.FullBox;
import com.mycompany.app.Aufgabenblatt5.NotEnoughMoneyException;
import com.mycompany.app.Aufgabenblatt5.UnlimitedCashBox;
import com.mycompany.app.Aufgabenblatt5.VendingMachineImpl;
import com.mycompany.app.Aufgabenblatt5.Box;
import com.mycompany.app.Aufgabenblatt5.BoxEmptyException;

import static org.mockito.Mockito.*;


public class VendingMachineImplSpyTest {
	
    private VendingMachineImpl vendingMachine;
    private FullBox fullBox1;
    private FullBox fullBox2;
    private UnlimitedCashBox unlimitedCashBox;

    @Before
    public void setUp() {
    	
        unlimitedCashBox = spy(UnlimitedCashBox.class);
        fullBox1 = spy(FullBox.class);
        fullBox2 = spy(FullBox.class);
        Box[] boxArray = {fullBox1, fullBox2};
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);
    }
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        vendingMachine.selectItem(1);

        verify(fullBox2).getPrice();
        verify(unlimitedCashBox).getCurrentAmount();

    }
}

