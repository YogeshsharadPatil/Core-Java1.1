package com.ysp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		System.out.println("on LLogin page");
		dr.get("http://127.0.0.1:5500/Login.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("navigating to Registraton page");
		dr.navigate().to("http://127.0.0.1:5500/Registration.html");
		
		
		
		

	}

}
