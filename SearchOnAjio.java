package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOnAjio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.Ajio.com/");
		Thread.sleep(2000) ;
		driver.findElement(By.name("searchVal")).sendKeys("Watches") ;
		Thread.sleep(2000) ;
		
		driver.findElement(By.className("ic-search")).click();
		Thread.sleep(2000) ;
		
		driver.findElement(By.cssSelector("img[alt='Product image of FOSSIL Women ES5092 Water-Resistant Analogue Watch']")).click();

	}

}
