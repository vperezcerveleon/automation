package com.slokam.automation.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryUI {

	public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
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
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		File file2 = new File("D:\\sample.jpeg");
		try {
			FileUtils.copyFile(file, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
	}
	
	public static void main(String[] args) {
		JQueryUI g = new JQueryUI();
		g.test1();
	}
}
