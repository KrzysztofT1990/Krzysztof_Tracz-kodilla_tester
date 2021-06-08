package homework.fizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class fizzBuzzSteps implements En {

    private int number;
    private String answer;

    public fizzBuzzSteps() {
        Given("given number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I ask about the password for the given number", () -> {
            FizzBuzz fizzBuzzNone = new FizzBuzz();
            this.answer = fizzBuzzNone.getNumber(number);
        });

        Then("You should say {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
