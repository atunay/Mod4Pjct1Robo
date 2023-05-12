package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RobolegsTest {


    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);


        String url = ("https://robotsparebinindustries.com/");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("maria");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("thoushallnotpass");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/form/button")).click();

        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"head\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/form/div[2]/div/div[3]/label")).click();
        //driver.findElement(By.xpath("//*[@id=\"1683875896055\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"1683875896055\"]")).sendKeys("4");
    }
}

