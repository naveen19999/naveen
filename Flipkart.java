package org.flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

public static void main(String[] args) throws AWTException {
	
	WebDriver driver = new ChromeDriver();
	Robot robot = new Robot();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=7876550962781949844&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061894&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=EAIaIQobChMIsMyB-LO8_AIV7ZhmAh3IHQOtEAAYASAAEgIG0fD_BwE");
	driver.manage().window().maximize();
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	// robot.keyPress(KeyEvent.VK_CONTROL);
	//robot.keyPress(KeyEvent.VK_A);
	//robot.keyRelease(KeyEvent.VK_A);
	//robot.keyPress(KeyEvent.VK_X);
	//robot.keyRelease(KeyEvent.VK_X);
	//robot.keyRelease(KeyEvent.VK_CONTROL);
	WebElement down = driver.findElement(By.xpath("//div[text()='Make Money with Us']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(true)",down);
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	File ds = new File("C:\\Users\\Admin\\eclipse-workspace\\SaleniumFirstDay\\nav\\raj.png");
	
	
	
	
	
	
	
	}

}
