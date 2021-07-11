package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPF;
import com.util.BaseConfig;
import com.util.HighLight;
import com.util.Screenshot;

public class Baselogin {
	public static void getLogin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(BaseConfig.getConfigFile("URL"));
		driver.manage().window().maximize();
		MasterPF obj = new MasterPF(driver);

		Screenshot.getpics(driver, "Before SignIn");
		HighLight.getColor(driver, obj.getSignIn());
		obj.getSignIn().click();

		HighLight.getColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getConfigFile("Username"));

		HighLight.getColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getConfigFile("Password"));

		HighLight.getColor(driver, obj.getSubmit());
		obj.getSubmit().click();

		Screenshot.getpics(driver, "Before SignOut");
		HighLight.getColor(driver, obj.getSignout());
		obj.getSignout().click();
	}
}