package org.sam;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("hellow");
	String attribute = findElement.getAttribute("value");
	findElement.getTagName();
	
	System.out.println(attribute);
	driver.quit();
}
}
