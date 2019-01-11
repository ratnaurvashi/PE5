import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ChangeMapTest {

    ChangeMap test;

    @Before
    public void setUp() throws Exception {
        test = new ChangeMap();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void changeMapSuccess(){
        Map<String,String> expectedmap1 = new HashMap<>();
        expectedmap1.put("val1"," ");
        expectedmap1.put("val2","java");

        Map<String,String> expectedmap2 = new HashMap<>();
        expectedmap2.put("val1"," ");
        expectedmap2.put("val2","mars");

        Map<String,String> input1 = new HashMap<>();
        input1.put("val1","java");
        input1.put("val2","c++");

        Map<String,String> input2 = new HashMap<>();
        input2.put("val1","mars");
        input2.put("val2","saturn");

        Map<String,String> actualresult1 = test.changeMap(input1);
        assertEquals(expectedmap1,actualresult1);

        Map<String,String> actualresult2 = test.changeMap(input2);
        assertEquals(expectedmap2,actualresult2);
    }

    @Test
    public void changeMapFailure(){
        Map<String,String> expectedmap1 = new HashMap<>();
        expectedmap1.put("val1","java");
        expectedmap1.put("val2","c++");

        Map<String,String> expectedmap2 = new HashMap<>();
        expectedmap2.put("val1","mars");
        expectedmap2.put("val2","saturn");

        Map<String,String> input1 = new HashMap<>();
        input1.put("val1","java");
        input1.put("val2","c++");

        Map<String,String> input2 = new HashMap<>();
        input2.put("val1","mars");
        input2.put("val2","saturn");

        Map<String,String> actualresult1 = test.changeMap(input1);
        assertNotEquals(expectedmap1,actualresult1);

        Map<String,String> actualresult2 = test.changeMap(input2);
        assertNotEquals(expectedmap2,actualresult2);
    }

    @Test
    public void changeMapVal1Empty(){
        Map<String,String> expectedmap1 = new HashMap<>();
        expectedmap1.put("val1","");
        expectedmap1.put("val2","c++");

        Map<String,String> input1 = new HashMap<>();
        input1.put("val1","");
        input1.put("val2","c++");


        Map<String,String> actualresult1 = test.changeMap(input1);
        assertEquals(expectedmap1,actualresult1);
    }
}