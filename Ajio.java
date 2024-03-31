package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.Ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("Watches") ;
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Women')]")).click();

	}

}
