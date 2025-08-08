package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlekseiTest {

    @Test
    public void testABTestControl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement aBTestingLink = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
        aBTestingLink.click();

        Thread.sleep(1000);

        WebElement pageHeader = driver.findElement(By.xpath("//div/h3"));
        String pageHeaderText = pageHeader.getText();

        Assert.assertTrue(pageHeaderText.contains("A/B Test"), "Page header doesn't contains A/B Test");

        driver.quit();
    }
}
