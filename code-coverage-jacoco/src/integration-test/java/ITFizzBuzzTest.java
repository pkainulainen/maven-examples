import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
public class ITFizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getFizzBuzzWord(3), is("Fizz"));
    }

    //Commented out on purpose so that you can see the difference in code coverage reports
    /*
    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(5), is("Buzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThreeAndFive_ShouldReturnFizzBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(15), is("FizzBuzz"));
    }
    */

    @Test
    public void getFizzBuzzWord_NumberIsNotMultipleOfThreeOrFive_ShouldReturnNull() {
        assertNull(fizzBuzz.getFizzBuzzWord(4));
    }
}
