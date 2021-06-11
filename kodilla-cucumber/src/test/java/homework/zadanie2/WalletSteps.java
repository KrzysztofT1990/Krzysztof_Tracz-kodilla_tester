package homework.zadanie2;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("there is $100 in my wallet1", () -> wallet.deposit(100));
        When("I check the balance of my wallet", () -> System.out.println(wallet.getBalance()));
        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        //****************************************

        Given("there is $100 in my wallet2", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });
        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money in your wallet", "You don't have enough money in your wallet");
        });
    }
}