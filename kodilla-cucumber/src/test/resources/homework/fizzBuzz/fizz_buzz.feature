Feature: A game "Fizz-Buzz"
  If a number is divided by 5 & 3 - say "FizzBuzz",
  if by 3 - say "Fizz", if by 5 - say "Buzz"
  in other cases - say "None"

  Scenario Outline: Answer the right word as a reaction to a given number
    Given given number is <number>
    When I ask about the password for the given number
    Then You should say <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 9      | "Fizz"     |
      | 5      | "Buzz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 30     | "FizzBuzz" |
      | 4      | "None"     |
      | 7      | "None"     |