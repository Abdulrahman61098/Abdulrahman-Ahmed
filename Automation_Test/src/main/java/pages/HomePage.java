package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By SearchField= By.name("q");
	private  By SearchBtn= By.name("btnK");
	private  By SuggestedItem = By.cssSelector("li.sbct:nth-child(1)");

	public void Search(String Search)
	{
		fill_in_Text(driver.findElement(SearchField), Search);
		clickButton(driver.findElement(SearchBtn));
	}
	
	public void SearchWithAutoSuggest(String Search)
	{
		fill_in_Text(driver.findElement(SearchField), Search);
		driver.findElement(SuggestedItem).click();
	}



}
