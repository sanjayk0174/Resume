package steps;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class ClearTrip extends DriverSetup {
	
  WebDriver driver;
  WebElement element;
  ExcelReadWrite excel = new ExcelReadWrite();
  @Test
  public void f()throws Exception  {
	  
	  driver.findElement(By.xpath("(//*[@name='trip_type'])[2]")).click();
	  element=driver.findElement(By.xpath("//*[@id='FromTag']"));
	  String from = excel.getFromdata();
	  element.sendKeys(from);
	  Thread.sleep(5000);
	  element.sendKeys(Keys.ENTER);
	  element=driver.findElement(By.xpath("//*[@id='ToTag']"));
	  String to=excel.getToData();
	  element.sendKeys(to);
	  Thread.sleep(5000);
	  element.sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@data-on-select='fromHandler']")).click();
	  driver.findElement(By.xpath("(//a[contains(text(),'25')])[1]")).click();
	  driver.findElement(By.xpath("//*[@data-on-select='toHandler']")).click();
	  driver.findElement(By.xpath("(//a[contains(text(),'25')])[2]")).click();
	  driver.findElement(By.xpath("//*[@id='SearchBtn']")).click();
	  Thread.sleep(15000);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  
	  driver=setupChromeDriver();
	  driver.get("https://www.cleartrip.com/");
	  driver.manage().window().maximize();

	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
