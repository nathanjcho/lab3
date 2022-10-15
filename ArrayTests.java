import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversedOrder() {
    int [] input1 = {1,2,3,4};
    int [] inputR1 = {4,3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(inputR1, input1);
  }

  @Test 
  public void testReversedOrderArray() {
    int [] input1 = {1,2,3,4};
    int [] inputR1 = {4,3,2,1};
    assertArrayEquals(inputR1, ArrayExamples.reversed(input1));

  }

  @Test 
  public void testAverage() {
    double [] input1 = {1,2,3,4,5};
    assertEquals(, ArrayExamples.averageWithoutLowest(input1), delta: 0.00001);

  }
}
