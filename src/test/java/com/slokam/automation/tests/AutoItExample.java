package com.slokam.automation.tests;

import java.io.File;

import org.testng.annotations.Test;

import com.jacob.com.LibraryLoader;
import com.slokam.automation.opencart.commons.utilites.AutomationUtils;

import autoitx4java.AutoItX;

public class AutoItExample {

	
	@Test
	public void test1() {
		File file = new File("./src/test/resources/jacob-1.14.3-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX auto = new AutoItX();
		auto.send("#r", false);
		auto.winWait("Run");
		auto.winActivate("Run");
		auto.send("notepad{ENTER}",false);
		auto.winWait("Untitled - Notepad");
		auto.winActivate("Untitled - Notepad");
		auto.send("abc");
		auto.send("^s",false);
		auto.winWait("Save As");
		AutomationUtils.sleep(5);
		auto.winActivate("Save As");
		
		auto.controlSend("Save As", "", "[CLASS:Edit; INSTANCE:1]", "test.txt");
		auto.controlClick("Save As", "", "[CLASS:Button; INSTANCE:2]");
	}
}
