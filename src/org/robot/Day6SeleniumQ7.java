/*
 * URL : http://greenstech.in/selenium-course-content.html

NOTE: Select all the  content below in wrapper class and then rightClick  and select search for google.
 */
package org.robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6SeleniumQ7 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day6Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement wrapper = driver.findElement(By.xpath("//a[@href = '#Wrapper_Classes']"));
		wrapper.click();
	}

}
