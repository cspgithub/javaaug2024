// package com.example.Aug17;

// import java.time.Duration;

// import java.util.Optional;


// import org.openqa.selenium.WebDriver;

// import org.openqa.selenium.chrome.ChromeDriver;

// import org.testng.annotations.Test;

// import org.openqa.selenium.devtools.DevTools;
// // import org.openqa.selenium.devtools.v127.network.Network;

// // import org.openqa.selenium.devtools.v127.network.model.Response;

// public class WAaitTest {

//     long timeSpent = 0;
//     String REQUEST_url= "";

//     @Test
//     public void shouldAnswerWithTrue() throws InterruptedException {
//         WebDriver driver = new ChromeDriver();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//         DevTools devTools = ((ChromeDriver) driver).getDevTools();
//         devTools.createSession();

//         devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

//         // Listener to capture the request URL
//         devTools.addListener(Network.requestWillBeSent(), request -> {
//             REQUEST_url = request.getRequest().getUrl();
//         });

//         // Listener to capture the response status code and print only if not 200
//         devTools.addListener(Network.responseReceived(), responseReceived -> {
//             Response response = responseReceived.getResponse();

//             if (! (response.getStatus() <= 300 )) {  // Only print if status is not 200
//                 System.out.println("Response URL: " + response.getUrl());
//                 System.out.println("Response Status Code: " + response.getStatus());

//                 if (response.getStatus() > 400) {
//                     throw new RuntimeException("---------------->>> " + REQUEST_url + " is giving " + response.getStatus());
//                 }
//             }
//         });



//         driver.navigate().to("https://www.semrush.com/blog/broken-link/tyu/");

//         // driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

//         // driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

//         // driver.findElement(By.cssSelector("#login-button")).click();
//         // Click submit
//         // WebElement submitButton =
//         // driver.findElement(By.cssSelector("#submitButton"));
//         // Instant start = Instant.now();

//         // submitButton.click();

//         // try {
//         // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//         // // Wait until the loader is displayed
//         // List<WebElement> loader = driver
//         // .findElements(By.xpath("//div[@id='loaderContainer']/div[@class='loader']"));
//         // if (loader.size() > 0) {
//         // System.out.println("elent number found:-----" + loader.size());
//         // wait.until(d -> loader.get(0).isDisplayed());

//         // wait.until(ExpectedConditions.invisibilityOf(loader.get(0)));

//         // Instant end = Instant.now();
//         // long timeSpent = Duration.between(start, end).getSeconds();
//         // System.out.println("Loader took " + timeSpent + " seconds.");
//         // }

//         // } catch (Exception e) {
//         // System.out.println("Loader disappeared very quickly or didn't appear. or
//         // element not pressnt in DOM");
//         // e.printStackTrace();
//         // }

//         // // Now check the table rows after the loader disappears
//         // List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
//         // Assert.assertTrue(rows.size() == 3);

//         // System.out.println("Script handled gracefully....");
//         driver.quit();
//     }
// }
