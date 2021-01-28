package com.mycompany.app.Aufgabenblatt5;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.Aufgabenblatt5.BoxEmptyException;
import com.mycompany.app.Aufgabenblatt5.FullBox;
import com.mycompany.app.Aufgabenblatt5.NotEnoughMoneyException;
import com.mycompany.app.Aufgabenblatt5.UnlimitedCashBox;
import com.mycompany.app.Aufgabenblatt5.VendingMachineImpl;
import com.mycompany.app.Aufgabenblatt5.Box;

import static org.mockito.Mockito.*;

public class VendingMachineImplMockitoTest {
    private VendingMachineImpl vendingMachine;
    private FullBox fullBox1;
    private FullBox fullBox2;
    private UnlimitedCashBox unlimitedCashBox;

    @Before
    public void setUp() {
        unlimitedCashBox = mock(UnlimitedCashBox.class);
        fullBox1 = mock(FullBox.class);
        fullBox2 = mock(FullBox.class);
        Box[] boxArray = {fullBox1, fullBox2};
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);
    }
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        when(fullBox2.getPrice()).thenReturn(1);
        when(unlimitedCashBox.getCurrentAmount()).thenReturn(Integer.MAX_VALUE);
        vendingMachine.selectItem(1);

        verify(fullBox2).getPrice();
        verify(unlimitedCashBox).getCurrentAmount();

    }
}