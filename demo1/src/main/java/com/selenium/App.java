package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        try {
            WebDriverManager.chromedriver().setup(); // setting the driver

            WebDriver driver = new ChromeDriver(); // creating the driver object
            driver.get("https://www.google.com"); // load the url
            driver.manage().window().maximize();
            driver.findElement(By.name("q")).sendKeys("Taylor Swift", Keys.ENTER); // enter taylor swift in search box
            Thread.sleep(3000); // sleep for 3 seconds
            driver.quit(); // quit from the driver
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
