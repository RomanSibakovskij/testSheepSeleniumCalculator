package io.github.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
//        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1920,1080"); // -> this configuration is for GitHub CI headless test runs
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }

    @AfterEach //comment out Thread.sleep for visual confirmation, in headless mode it's not needed
    public void close() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.quit();
    }
}
