import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Main {
    public static void main(String... arg){


        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://careers.veeam.com/");



        if (driver.findElements(By.id("country")) != null){
            System.out.println("Success!");
        }

        List<WebElement> country = driver.findElements(By.id("country"));

        for (WebElement element: country) {
            System.out.println(element.toString());
        }

        try {
            driver.findElement(By.id("country")).click();
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }

        System.out.println(country);
        driver.quit();
    }
}
