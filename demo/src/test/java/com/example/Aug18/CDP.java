package com.example.Aug18;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.network.Network;
import org.testng.annotations.Test;

public class CDP {
    @Test
    public void shouldAnswerWithTrue() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--user-agent=Mozilla/5.0 ... Chrome/110.0.0.0 Safari/537.36"); // Customize user-agent
                                                                                             // string if needed

        WebDriver driver = new ChromeDriver(options);

        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(),
                request -> System.out.println("----request" + request.getRequest().getUrl()));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://herotechnologyinc.com/course/automation-selenium-with-java/#");

        driver.quit();

    }

}
