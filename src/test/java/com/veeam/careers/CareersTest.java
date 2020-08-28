package com.veeam.careers;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class CareersTest {
    public static WebDriver driver;

    @BeforeClass
    public static void init(){
        System.setProperty("webdriver.chrome.driver", ConfPropReader.getProperty("chrome_driver"));

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfPropReader.getProperty("test_page"));
    }

    @Test
    public void test() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"country-element\"]/div/span")).click();

        driver.findElement(By.xpath("//*[@id=\"country-element\"]/div/div/div[2]/span[11]")).click();

        driver.findElement(By.xpath("//*[@id=\"language\"]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"language\"]/div[1]/div[2]/div/div/fieldset/label[3]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"language\"]/div[2]/div/div/a")).click();


        WebElement content_loader_button = driver.findElement(By.xpath("//*[@id=\"index-vacancies-buttons\"]/div/a"));

        while(content_loader_button.isDisplayed()){
            content_loader_button.click();
            Thread.sleep(3000);
        }

        Thread.sleep(3000);

        List<WebElement> jobs = driver.findElements(By.xpath("//*[@id=\"hp\"]/section[3]/div/div[1]/div/div"));

        assertEquals(23, jobs.size());
    }


        @AfterClass
    public static void shutdown(){
        driver.quit();
    }
}
