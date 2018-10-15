package ru.deliveryClub;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.crome.driver","D:/Download");
        ChromeDriver driver = new ChromeDriver();
        driver.get("htpps://www.delivery-club.ru/");
        String title=driver.getTitle();
        Assert.assertTrue(title.equals(""));
        driver.quit();
    }
}
