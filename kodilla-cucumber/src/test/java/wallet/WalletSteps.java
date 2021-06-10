package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    private int dispended;

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request ${int}", (Integer int1) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, int1);
        });

        Then("${int} should be dispensed", (Integer int2) -> {
            Assert.assertEquals(cashSlot.getContents(), (int) int2);
        });
    }
}
