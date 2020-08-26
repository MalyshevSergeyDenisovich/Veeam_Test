package com.veeam.careers;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://careers.veeam.com/");
        driver.quit();
    }
}
