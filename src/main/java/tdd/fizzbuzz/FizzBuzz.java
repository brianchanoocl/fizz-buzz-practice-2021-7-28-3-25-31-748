package tdd.fizzbuzz;

//[fizzBuzz] [Brian] -feat

public class FizzBuzz {
    public String countoff(int order){
        String response = "";
        if(order %3 == 0)
            response += "Fizz";
        if(order %5 == 0)
            response += "Buzz";
        if(order %7 == 0)
            response += "Whizz";
        if(response.length() <= 1)
            return String.valueOf(order);

        return response;
    }
}
