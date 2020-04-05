package FizzBuzz;
public class FizzBuzz {
    public static String fizzBuzzOut(int i) {
    String out;
        if (i % 3 == 0 && i % 5 == 0) {
            out="FizzBuzz";
        }
        else if (i % 3 == 0) {
            out="Fizz";
        }
        else if (i % 5 == 0) {
            out="Buzz";
        }
        else {
            out=String.valueOf(i);
        }
        return out;
    }

}
