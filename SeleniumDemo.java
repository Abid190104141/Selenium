package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.get("https://rahulshettyacademy.com/");
        //System.out.println(driver.getTitle());
       // driver.quit();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();






    }





}
