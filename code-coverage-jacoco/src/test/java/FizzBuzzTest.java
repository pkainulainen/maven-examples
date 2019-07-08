import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getFizzBuzzWord(3), is("Fizz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(5), is("Buzz"));
    }

}
