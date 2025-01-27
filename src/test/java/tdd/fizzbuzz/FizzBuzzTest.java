package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_number_when_countOff_given_order_is_not_multiple_of_3_5_or_7(){
        // given
        int order = 2;
        String expectedResult = "2";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_Fizz_when_countOff_given_order_is_multiple_of_3(){
        // given
        int order = 3;
        String expectedResult = "Fizz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_Buzz_when_countOff_given_order_is_multiple_of_5(){
        // given
        int order = 5;
        String expectedResult = "Buzz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_Whizz_when_countOff_given_order_is_multiple_of_7(){
        // given
        int order = 7;
        String expectedResult = "Whizz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_FizzBuzz_when_countOff_given_order_is_multiple_of_3_and_5(){
        // given
        int order = 15;
        String expectedResult = "FizzBuzz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_FizzWhizz_when_countOff_given_order_is_multiple_of_3_and_7(){
        // given
        int order = 21;
        String expectedResult = "FizzWhizz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_BuzzWhizz_when_countOff_given_order_is_multiple_of_5_and_7(){
        // given
        int order = 35;
        String expectedResult = "BuzzWhizz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_countOff_given_order_is_multiple_of_3_5_and_7(){
        // given
        int order = 105;
        String expectedResult = "FizzBuzzWhizz";

        // when
        String result = fizzBuzz.countOff(order);

        // then
        assertEquals(expectedResult, result);
    }
}
