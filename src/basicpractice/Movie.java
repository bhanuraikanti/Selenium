package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/");
    Thread.sleep(3000);
    Actions a = new Actions(driver);
   a.moveToElement(driver.findElement(By.xpath("//a[text()=\"Selenium Practice\"]")));
    Thread.sleep(3000);
    a.moveToElement(driver.findElement(By.xpath("//a[text()=\"CSS Selectors Practice\"]"))).click().build().perform();
    Thread.sleep(3000);
    driver.findElement(By.id("firstName")).sendKeys("yyyyyy");
    
    
	}

}
