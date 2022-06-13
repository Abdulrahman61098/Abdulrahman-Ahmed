package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	public WebDriver driver ;

	// create constructor
	public PageBase(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	protected static  void clickButton(WebElement button)
	{
		button.click();
	}

	protected static void fill_in_Text(WebElement textElement , String value)
	{
		textElement.sendKeys(value);
	}


	public void clearText(WebElement element)
	{
		element.clear();
	}


}
