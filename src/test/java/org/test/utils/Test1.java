package org.test.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\WaitsConcept\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		FluentWait f = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.MILLISECONDS).ignoring(Exception.class);
		WebElement e = (WebElement)f.until(ExpectedConditions.elementToBeClickable(By.id("usernam")));
		driver.findElement(By.id("usernam")).sendKeys("shahul");
	}
}
