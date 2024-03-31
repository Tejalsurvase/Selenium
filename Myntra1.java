package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object of chromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		/*//launch the application 
		driver.get("https://www.myntra.com/");
		
		//enter watches in search
		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("bags");
		driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();*/
		
		//launch the application
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten pass")).click();
	}

}
