package com.ysp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdQuetionHrRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("http://127.0.0.1:5500/LoginHRRole.html");
		dr.findElement(By.xpath("/html/body/form/input[1]")).click();
		dr.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("Yogesh@gmail.com");
		dr.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Yogesh");
		
		dr.findElement(By.xpath("/html/body/form/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/form/input[3]")).click();
		dr.findElement(By.xpath("/html/body/form/button")).click();
	
	}

}
