package com.browser.selenium;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.Seleniumbase;

public class BrowserLaunch extends Seleniumbase {
public static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserLaunch("chrome");
}
}