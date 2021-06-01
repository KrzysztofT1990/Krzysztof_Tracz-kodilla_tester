package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Thread.sleep(2000);
        WebElement alert = driver.findElement(By.xpath("/html/body/div[3]/div[8]/div/div/div/div/div[2]/div[2]/button[1]"));
        alert.click();

        WebElement elektronika = driver.findElement(By.xpath("//select[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
        Select elek2 = new Select(elektronika);
        elek2.selectByIndex(3);

        WebElement findField = driver.findElement(By.xpath("//input[@placeholder=\"czego szukasz?\"]"));
        findField.sendKeys("Mavic mini");

        WebElement findButton = driver.findElement(By.xpath("//button[@data-role=\"search-button\"]"));
        findButton.click();
    }
}