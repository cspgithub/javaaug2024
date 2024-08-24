package com.example;

import java.time.Duration;
import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class ConsumerDropdown {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://herotechnologyinc.com/course/automation-selenium-with-java/#");

        String passedValue = "Selenium Introduction";

        List<WebElement> listOfAccordian = driver.findElements(By.xpath("//div[@id='accordionExample4']/div//button"));

        Consumer<WebElement> consumer = (item) -> {
            if (item.getText().contains(passedValue)) {
                item.click();
              
            } 
        };

        listOfAccordian.forEach(consumer);

        driver.quit();

    }
}
