import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringAppearanceTest {
    StringAppearance test;

    @Before
    public void setUp() throws Exception {
        test = new StringAppearance();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void stringAppearanceSuccess(){
        Map<String,Boolean> expectedresult = new HashMap();
        expectedresult.put("a",true);
        expectedresult.put("b",false);
        expectedresult.put("c",true);
        expectedresult.put("d",false);

        Map<String,Boolean> actualresult = test.stringAppearance(new String[] {"a","b","c","d","a","c","c"});
        assertEquals(expectedresult,actualresult);
    }

    @Test
    public void stringAppearanceFailure(){
        Map<String,Boolean> expectedresult = new HashMap();
        expectedresult.put("a",false);
        expectedresult.put("b",false);
        expectedresult.put("c",false);
        expectedresult.put("d",false);

        Map<String,Boolean> actualresult = test.stringAppearance(new String[] {"a","b","c","d","a","c","c"});
        assertNotEquals(expectedresult,actualresult);
    }
}