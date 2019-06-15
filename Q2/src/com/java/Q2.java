package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group031\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.org/clientarea.php");
		
		driver.findElement(By.linkText("Register")).click();;
		driver.findElement(By.id("inputFirstName")).sendKeys("prajay");
		Thread.sleep(1000);
		driver.findElement(By.id("inputLastName")).sendKeys("bahekar");
		Thread.sleep(1000);
		driver.findElement(By.id("inputEmail")).sendKeys("prajaybahekar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]")).click();
		driver.findElement(By.id("inputPhone")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputCompanyName\"]")).sendKeys("ASHAPrivate Ltd.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("Paud Road");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]")).sendKeys("Kothrud");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"stateinput\"]")).sendKeys("Maharashtra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputPostcode\"]")).sendKeys("415468");
		Thread.sleep(1000);
		driver.findElement(By.id("inputCountry")).click();
		driver.findElement(By.xpath("//*[@id=\"inputCountry\"]/option[102]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputTaxId\"]")).sendKeys("12345659");
		Thread.sleep(1000);
		driver.findElement(By.id("customfield1")).click();
		driver.findElement(By.xpath("//*[@id=\"customfield1\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"customfield2\"]")).sendKeys("656446456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"inputNewPassword1\"]")).sendKeys("Prajay@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"inputNewPassword2\"]")).sendKeys("Prajay@1234");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/p/input")).click();
	}

}
