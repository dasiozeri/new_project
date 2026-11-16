package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //שאלה 2
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        //שאלה 3
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //שאלה 4
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        String right_item = driver.findElement(By.className("shopping_cart_badge")).getText();
        if (right_item.equals("2")) {
            System.out.println("כמות הפריטים בעגלה נכונה!");
        } else {
            System.out.println("אופס... כמות הפריטים בעגלה אינה נכונה יש!");

        }
        //שאלה 5
        driver.findElement(By.className("shopping_cart_link")).click();

        String right_page = driver.findElement(By.className("title")).getText();
        if (right_item.equals("Your Cart")) {
            System.out.println("הגעת לעמוד של העגלה");
        }
        else {
            System.out.println("אופס... לא הגעת לעמוד של העגלה");

        }

        //שאלה 6
        driver.findElement(By.id("continue-shopping")).click();


        //שאלה 7
        driver.findElement(By.id("remove-sauce-labs-onesie")).click();
        driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
        driver.quit();










    }


}