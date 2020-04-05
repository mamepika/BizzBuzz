import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import FizzBuzz.*;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Before
    public void setUp() throws Exception {
        FizzBuzz fizzbuzz=new FizzBuzz();
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test1() {
        FizzBuzz fizzbuzz=new FizzBuzz();
        assertEquals("1", fizzbuzz.fizzBuzzOut(1));
    }
    @Test
    public void test3() {
        FizzBuzz fizzbuzz=new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.fizzBuzzOut(3));
    }
    @Test
    public void test5() {
        FizzBuzz fizzbuzz=new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.fizzBuzzOut(5));
    }
    @Test
    public void test15() {
        FizzBuzz fizzbuzz=new FizzBuzz();
        assertEquals("FizzBuzz", fizzbuzz.fizzBuzzOut(15));
    }
    @Test
    public void test100() {
        FizzBuzz fizzbuzz=new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.fizzBuzzOut(100));
    }

}