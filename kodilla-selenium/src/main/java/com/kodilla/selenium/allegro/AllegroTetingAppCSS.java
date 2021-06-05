package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTetingAppCSS {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);

        Thread.sleep(17000);
        WebElement alert = driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div/div/div/div[2]/div[2]/button[1]"));
        alert.click();

        WebElement elektronika = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        elektronika.click();

        WebElement findField = driver.findElement(By.cssSelector("input[type='search']"));
        findField.sendKeys("Mavic mini");

        WebElement szukajButton = driver.findElement(By.cssSelector("button[type='submit']"));
        szukajButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

        List<WebElement> lista = driver.findElements(By.cssSelector("article[data-analytics-enabled='true']"));

        for (WebElement element : lista) {
            System.out.println(element.getText());
            System.out.println("\n================================\n");
        }

    }
}
