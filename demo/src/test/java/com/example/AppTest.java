package com.example;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.unilever.com.my/");

        Actions ac = new Actions(driver);
        By footerLink = By.xpath("//ul[@class='uco-c-footer__menu-list']/li/a/span[normalize-space()='Legal']");

        WebElement element = driver.findElement(footerLink);

      

        ac.scrollToElement(element).perform();
        // "arguments[0]" refers to the first argument passed to the script, which in
        // this case is the WebElement element.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }

    // private void actionOnWebElement(Consumer<WebElement> consumer) {

    //     WebElement element = null;

    //     consumer.accept(element);

    // }
}
