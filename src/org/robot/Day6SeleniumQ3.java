/*
 * 
URL : http://www.greenstechnologys.com/

NOTE: Select first paragraph using double click then right click and select print using Robot class
 */
package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6SeleniumQ3 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day6Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement txtFirstPara = driver.findElement(By.xpath("//*[@id=\'article-wrapper\']/p[1]")); 
		Actions acc= new Actions(driver);
		acc.doubleClick(txtFirstPara).perform();
		WebElement pageSelect = driver.findElement(By.xpath("//div[@id = 'wrapper']"));
		acc.contextClick(pageSelect).perform();
		Robot r = new Robot();
		
		for(int index = 0; index < 4; index++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		//acc.doubleClick().perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		
		}
}
