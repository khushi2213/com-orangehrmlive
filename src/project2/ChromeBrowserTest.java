package project2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Set up the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get(baseUrl);

        //Print the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is" + title);

        //Print the Current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Print the  Page Source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Email Field Element
        WebElement userNameField = driver.findElement(By.name("username"));


        //Enter the email to email field
        userNameField.sendKeys("khushi123");

        //Find the password Field Element
        WebElement passwordField = driver.findElement(By.name("password"));


        //Enter the password to password field
        passwordField.sendKeys("Khushi@221");

        //Close The Browser
        driver.close();

    }
}




