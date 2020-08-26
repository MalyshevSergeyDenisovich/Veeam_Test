package com.veeam.careers;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FirstTest {

    public static WebDriver driver;

    @BeforeClass
    public static void init(){
        System.setProperty("webdriver.chrome.driver", ConfProp.getProperty("chrome_driver"));

        driver = new ChromeDriver();
        driver.manage().window().maximize();
/*        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        driver.get(ConfProp.getProperty("test_page"));
    }

    @Test
    public void test(){


    }


    @AfterClass
    public static void shutdown(){
        driver.quit();
    }
}
