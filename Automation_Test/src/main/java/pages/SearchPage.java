package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase
{
	public SearchPage(WebDriver driver) {super(driver);}


	private By ResultStats = By.id("result-stats");

	private By FirstResultItem = By.cssSelector("div.tF2Cxc");


	public boolean isResultDisplayed(){
		return driver.findElement(ResultStats).isDisplayed();
	}


	public String GetResultText ()
	{
		return driver.findElement(FirstResultItem).getText();
	}

	public boolean isTheResultMatched(String Search)
	{
		return driver.findElement(FirstResultItem).getText().contains(Search);
	}
}
