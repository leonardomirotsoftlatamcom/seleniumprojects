// Creado por Leo Miro - update 1

package seleniumcookbook.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.PageFactory;


public class BmiCalcPage {

	public WebElement heightCMS; 
	public WebElement weightKg; 
	public WebElement Calculate; 
	public WebElement bmi; 
	public WebElement bmi_category;
	private WebDriver driver;
	private String appUrl = "http://www.seleniumacademy.com/cookbook/bmicalculator.html";
	
	public BmiCalcPage() {    
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Win7_32b\\Desktop\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	} 
	
	public void load() {    
		this.driver.get(appUrl); 
	} 
	
	public void close() {    
		this.driver.close(); 
	}
	
	public void calculateBmi(String height, String weight) {    
		heightCMS.sendKeys(height);    
		weightKg.sendKeys(weight);    
		Calculate.click(); 
	}
	
	public String getBmi() {    
		return bmi.getAttribute("value"); 
	}
	
	public String getBmiCategory() {    
		return bmi_category.getAttribute("value"); 
	}
	
}
