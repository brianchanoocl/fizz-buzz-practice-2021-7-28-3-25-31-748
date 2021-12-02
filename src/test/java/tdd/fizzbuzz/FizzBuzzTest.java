package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @test
    void should_return_number_if_order_is_not_multiple_of_3_5_7(){
        // given
        int order = 2;
        String expectedResult = "2";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_3(){
        // given
        int order = 3;
        String expectedResult = "Fizz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_5(){
        // given
        int order = 5;
        String expectedResult = "Buzz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_7(){
        // given
        int order = 7;
        String expectedResult = "Whizz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_3_5(){
        // given
        int order = 15;
        String expectedResult = "FizzBuzz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_3_7(){
        // given
        int order = 21;
        String expectedResult = "FizzWhizz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_5_7(){
        // given
        int order = 35;
        String expectedResult = "BuzzWhizz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }

    @test
    void should_return_number_if_order_is__multiple_of_3_5_7(){
        // given
        int order = 105;
        String expectedResult = "FizzBuzzWhizz";

        // when
        String result = fizzBuzz.countoff(order);

        // then
        assertEquals(expectedResult, result);
    }
}
