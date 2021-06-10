Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<request>
    Then $<dispended> should be dispensed
    Examples:
      | request | dispended |
      | 30      | 30        |
      | 0       | 0         |
      | 200     | 200       |

