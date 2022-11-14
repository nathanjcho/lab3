import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CorrectListExamplesTest {
	
    @Test 
    public void testFilter() {
        String[] input1 = {"a","b","c","d","e"};
        ListExamples.filter(input1, new StringChecker() );
        assertArrayEquals(new String[]{"a","b","c","d","e"}, input1);
	}

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>("a","b");
        List<String> input2 = new ArrayList<String>("c","d","e");
        List<String> input3 = new ArrayList<String>("a","b","c","d","e");

        assertArrayEquals(input3, ListExamples.merge(input1, input2));
    }
















}