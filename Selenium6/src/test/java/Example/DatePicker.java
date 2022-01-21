package Example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	@Test	
	public void gettext () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshitha\\Documents\\chromedriver.exe");
		WebDriver d1;
		d1 =new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		JavascriptExecutor java=(JavascriptExecutor)d1;
		java.executeScript("document.getElementById('datepicker1').value='18/06/2000'");
		java.executeScript("document.getElementById('datepicker2').value='03/06/1998'");

}
}