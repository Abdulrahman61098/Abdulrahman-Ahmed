package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;


public class SearchTest extends TestBase
{
	HomePage homeObject ; 
	SearchPage SearchObject ;
	String searchItem = "Test Automation University";

	@Test(priority=1)
	public void UserCanSearchByAutoSuggest()
	{
		homeObject = new HomePage(driver); 
		SearchObject = new SearchPage(driver); 
		homeObject.SearchWithAutoSuggest(searchItem); 
	
		Assert.assertTrue(SearchObject.isResultDisplayed(),"Result not displayed");
		Assert.assertTrue(SearchObject.isTheResultMatched(searchItem),"Result not matched");
		System.out.println(SearchObject.GetResultText());
	}

	@Test(priority = 2)
	public void UsercanSearchByPressingGO()
	{
		homeObject = new HomePage(driver);
		SearchObject = new SearchPage(driver);
		homeObject.Search(searchItem);

		Assert.assertTrue(SearchObject.isResultDisplayed(),"Result not displayed");
		Assert.assertTrue(SearchObject.isTheResultMatched(searchItem),"Result not matched");
		System.out.println(SearchObject.GetResultText());
	}




}
