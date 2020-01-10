/*
 * URL : https://www.google.co.in/webhp 

NOTE: In google and click google apps(::) and click gmail app.
 */
package org.robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6SeleniumQ2 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day6Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		WebElement iconApp = driver.findElement(By.xpath("//a[@title = 'Google apps']"));
		iconApp.click();
		//WebElement selectGmail = driver.findElement(By.xpath("//*[text() = 'Gmail'][@data-pid = '23']"));
		WebElement selectGmail = driver.findElement(By.xpath("//span[@pid = '23'][@class = 'MrEfLc']"));
		selectGmail.click();
		//Actions acc = new Actions(driver);
		//acc.moveToElement(selectGmail).perform();
		//acc.Click(iconApp).perform();
		//WebDriver driver2 = new ChromeDriver();
		//WebElement gmailClick = driver2.findElement(By.xpath("//body[@id= 'yDmH0d']"));
		//gmailClick.click();
	}
}
