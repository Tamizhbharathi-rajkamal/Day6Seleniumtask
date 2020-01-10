/*
 * URL : http://greenstech.in/selenium-course-content.html

NOTE: Click download links here and just select selenium link and print it.
 */
package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Selenium8 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day6Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement downloadLink = driver.findElement(By.xpath("//a[contains(text(),'Download Links click here')]"));
		downloadLink.click();
		String s = downloadLink.getAttribute("href");
		WebDriver driver2 = new ChromeDriver();
		driver2.get(s);
		System.out.println(s);
		Robot r = new Robot();
		for(int index = 0; index < 3; index++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_0);
	}


}
}