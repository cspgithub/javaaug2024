package com.example;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class ConsumerDropdown1 {
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demoqa.com/select-menu");

        //List<WebElement> listOfAccordian = driver.findElements(By.xpath("//div[@id='accordionExample4']/div//button"));

        List<WebElement> options = new Select(driver.findElement(By.xpath("//select[@id='cars']"))).getOptions();
        

        options.forEach(e->e.click());
        
        Thread.sleep(2000);
        

        driver.quit();

    }

    
}
