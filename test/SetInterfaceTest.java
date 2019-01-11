import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetInterfaceTest {

    SetInterface test;

    @Before
    public void setUp() throws Exception {
        test = new SetInterface();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void sortNamesSuccess(){
        Set<String> expectedset = new HashSet<>();
        expectedset.add("Alice");
        expectedset.add("Bluto");
        expectedset.add("Eugene");
        expectedset.add("Harry");
        expectedset.add("Olive");

        Set<String> actualset = test.sortNames(new String[]{"Harry","Olive","Alice","Bluto","Eugene"});
        assertEquals(expectedset,actualset);
    }
    @Test
    public void sortNamesFailure(){
        Set<String> expectedset = new HashSet<>();
        expectedset.add("Alice");
        expectedset.add("Bluto");
        expectedset.add("Eugene");
        expectedset.add("Harry");
        expectedset.add("Olive");

        Set<String> actualset = test.sortNames(new String[]{"Alice","Olive","Alice","Bluto","Eugene"});
        assertNotEquals(expectedset,actualset);
    }

    @Test
    public void convertSortedSetSuccess(){
        List<String> expectedlist = new ArrayList<>();
        expectedlist.add("Alice");
        expectedlist.add("Bluto");
        expectedlist.add("Eugene");
        expectedlist.add("Harry");
        expectedlist.add("Olive");

        Set<String> input = new TreeSet<>();
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        input.add("Harry");
        input.add("Olive");

        List<String> actuallist = test.convertSortedSet(input);
        assertEquals(expectedlist,actuallist);
    }

    @Test
    public void convertSortedSetFailure(){
        List<String> expectedlist = new ArrayList<>();
        expectedlist.add("Alice");
        expectedlist.add("Bluto");
        expectedlist.add("Eugene");
        expectedlist.add("Harry");
        expectedlist.add("Olive");

        Set<String> input = new TreeSet<>();
        input.add("Bluto");
        input.add("Bluto");
        input.add("Eugene");
        input.add("Harry");
        input.add("Olive");

        List<String> actuallist = test.convertSortedSet(input);
        assertNotEquals(expectedlist,actuallist);
    }
}