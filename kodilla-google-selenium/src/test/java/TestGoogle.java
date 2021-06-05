import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.RandomPage;

import static org.junit.Assert.assertSame;


public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");

        Thread.sleep(2000);
        WebElement alert = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div[3]/button[2]/div"));
        alert.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void testOneRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.oneRandomResult();
        RandomPage resultRandomPage = new RandomPage(driver);

        WebElement webElement1 = resultRandomPage.clickInRandomPage(webElement);

        assertSame(webElement, webElement1);
    }

}
