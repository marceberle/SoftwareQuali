package com.mycompany.app.Aufgabenblatt4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStringTest {
    private MyString myString;
    private Object anObject;
    private Boolean result;

    @Test
    public void testSameObject() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = myString;
        // Execute
        this.result = myString.equalsObject(myString);
        // Verify
        assertTrue("Same Object should return true", result);
        // TearDown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testDifferentType() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new String("a");
        // Execute
        this.result = myString.equalsObject(anObject);
        // Verify
        assertFalse("Object that is not an instance of MyString should return false", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeSameString() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new MyString("a");
        // Execute
        this.result = myString.equalsObject(anObject);
        // Verify
        assertTrue("Object is of type MyString and same value as variable myString -> should return true", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeDifferentString() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new MyString("b");
        // Execute
        this.result = myString.equalsObject(anObject);
        // Verify
        assertFalse("Object is of type MyString and has different value as myString -> should return false", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testNumber() {
        // Set Up
        this.myString = new MyString("3");
        this.anObject = new MyString("3");
        // Execute
        result = myString.equalsObject(anObject);
        // Verify
        assertTrue("Object is of type MyString, has same input -> should return true", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testEmpty() {
        // Set Up
        this.myString = new MyString("");
        this.anObject = new MyString("");
        // Execute
        result = myString.equalsObject(anObject);
        // Verify
        assertTrue("Object is of type MyString, has same input -> should return true", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSpaceAndEmpty() {
        // Set Up
        this.myString = new MyString("");
        this.anObject = new MyString(" ");
        // Execute
        result = myString.equalsObject(anObject);
        // Verify
        assertFalse("Object is of type MyString, has different input -> should return false", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

}
