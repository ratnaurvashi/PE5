package com.stackroute.pe5test;

import com.stackroute.pe5main.ReplaceElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReplaceElementTest {
    ReplaceElement test;

    @Before
    public void setUp() throws Exception {
        test = new ReplaceElement();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void replaceElementSuccess(){
        ArrayList<String> expectedresult = new ArrayList<>();
        expectedresult.add("Kiwi");
        expectedresult.add("Grape");
        expectedresult.add("Mango");
        expectedresult.add("Berry");

        ArrayList<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        ArrayList<String> actualresult = test.replaceElement(input,new String[]{"Apple","Melon"},new String[] {"Kiwi","Mango"});
        assertEquals(expectedresult,actualresult);
    }

    @Test
    public void replaceElementFailure(){
        ArrayList<String> expectedresult = new ArrayList<>();
        expectedresult.add("Apple");
        expectedresult.add("Grape");
        expectedresult.add("Melon");
        expectedresult.add("Berry");

        ArrayList<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        ArrayList<String> actualresult = test.replaceElement(input,new String[]{"Apple","Melon"},new String[] {"Kiwi","Mango"});
        assertNotEquals(expectedresult,actualresult);
    }

    @Test
    public void replaceElementForNull(){
        ArrayList<String> input = null;
        ArrayList<String> actualresult = test.removeAllElements(input);
        assertNull(null,input);
    }

    @Test
    public void removeAllElementsSuccess(){
        ArrayList<String> expectedresult = new ArrayList<>();
        expectedresult.clear();

        ArrayList<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        ArrayList<String> actualresult = test.removeAllElements(input);
        assertEquals(expectedresult,actualresult);
    }

    @Test
    public void removeAllElementsFailure(){
        ArrayList<String> expectedresult = new ArrayList<>();
        expectedresult.add("Apple");
        expectedresult.add("Grape");
        expectedresult.add("Melon");
        expectedresult.add("Berry");

        ArrayList<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        ArrayList<String> actualresult = test.removeAllElements(input);
        assertNotEquals(expectedresult,actualresult);
    }

    @Test
    public void removeAllElementsForNull(){
        ArrayList<String> input = null;
        ArrayList<String> actualresult = test.removeAllElements(input);
        assertNull(null,actualresult);
    }

}