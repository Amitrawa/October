package Ocr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class octo {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver =new ChromeDriver ();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");



String[]itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

List<WebElement> products  =driver.findElements(By.cssSelector("h4.product-name"));

for (int i=0; i<products.size();i++)
{
	
	String name=products.get(i).getText();
	
	if (name.contains("Cucumber"))
	 {
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		break;
	 }
	
	
}


	Thread.sleep(3000);
	
	}

}
