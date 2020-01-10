/*
 * URL : https://www.flipkart.com/

NOTE: Click login/signup
      Type a  name in email textbox and cut and click continue and paste in password text using robot class
 */
package org.robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6SeleniumQ9 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day6Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement loginSignUp = driver.findElement(By.xpath("/account/login?ret=/"));
		loginSignUp.click();
		WebElement select = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		select.sendKeys("tamizhbharathi@gmail.com");
		
		
	}
	

}
