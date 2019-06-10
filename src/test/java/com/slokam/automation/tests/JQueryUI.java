package com.slokam.automation.tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JQueryUI {

	@Test
	public void test1() {
	
		URL hubUrl= null;
		try {
			hubUrl = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Capabilities cap = DesiredCapabilities.chrome();
		
		WebDriver driver = new RemoteWebDriver(hubUrl,cap);
		
		driver.manage().window().maximize();
		// launch url
		driver.get("https://jqueryui.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement demo = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(demo);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		System.out.println(target.getText());
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		
		System.out.println(driver.findElement(By.cssSelector("#droppable")).getText());
		
		driver.switchTo().defaultContent();
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file2 = new File("D:\\sample.jpeg");
		try {
			FileUtils.copyFile(file, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}
	
	@Test
	public void test2() {
		URL hubUrl= null;
		try {
			hubUrl = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Capabilities cap = DesiredCapabilities.chrome();
		
		WebDriver driver = new RemoteWebDriver(hubUrl,cap);
		driver.manage().window().maximize();
		// launch url
		driver.get("https://jqueryui.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement demo = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(demo);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		System.out.println(target.getText());
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		
		System.out.println(driver.findElement(By.cssSelector("#droppable")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
	
}
