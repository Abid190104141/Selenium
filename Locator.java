package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
       driver.findElement(By.id("inputUsername")).sendKeys("Abid");
       driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();




    }



}
