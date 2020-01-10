/*
 * URL : http://greenstech.in/selenium-course-content.html

NOTE: click cts interview question and print the first line.
 */
package org.robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6SeleniumQ4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day6Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement clk = driver.findElement(By.xpath("//*[@id=\'box-wrapper\']/div[6]/ul/li[6]/a"));
		Actions acc = new Actions(driver);
		acc.moveToElement(clk).perform();
	}

}
