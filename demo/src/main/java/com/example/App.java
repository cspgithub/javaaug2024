package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.manage().window().maximize();

        driver.get("https://economictimes.indiatimes.com/markets");

        WebElement table = driver.findElement(By.xpath("(//div[@class='content tabsContent']/ul/li)[1]//table//tbody"));

        new Actions(driver)
                .scrollToElement(table)
                .perform();

        List<WebElement> headers = driver
                .findElements(By.xpath("(//div[@class='content tabsContent']/ul/li)[1]//table/thead/tr/th"));

        // Find the indexes for the "Price" and "Name" columns
        int priceColumnIndex = -1;
        int nameColumnIndex = -1;
        for (int i = 0; i < headers.size(); i++) {
            String headerText = headers.get(i).getText();
            if (headerText.equalsIgnoreCase("Price")) {
                priceColumnIndex = i;
            } else if (headerText.equalsIgnoreCase("Name")) {
                nameColumnIndex = i;
            }
        }

        if (priceColumnIndex == -1 || nameColumnIndex == -1) {
            System.out.println("Required columns not found");
            return;
        }


        // Initialize variables to keep track of the highest age and corresponding name
        double highestPrice = Double.MIN_VALUE;
        String nameWithHighestPrice = "";

        // Iterate through the rows to find the highest age
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > priceColumnIndex) {
                String priceStr = cells.get(priceColumnIndex).getText().replace(",", "");
                double price = Double.parseDouble(priceStr);
                if (price > highestPrice) {
                    highestPrice = price;
                    nameWithHighestPrice = cells.get(nameColumnIndex).getText();
                }
            }
        }

        // Output the name with the highest age
        System.out.println("Name with the highest price: " + nameWithHighestPrice);
       

       

        driver.close();
        driver.quit();
    }
}
