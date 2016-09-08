package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers {
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver; 
		this.test = test;
		Thread.sleep(5000);
	}
	public void clickMergeLeads()
	{
		clickByLink(prop.getProperty("Merge Leads"));
	}
	
	public void fromlead() {
		clickByXpath(prop.getProperty("MergeLead.fromlead.Xpath"));
		//switchToLastWindow();
		//clickByXpath(prop.getProperty(("MergeLead.firstlead.Xpath")));
		//switchToParentWindow();

	}
	
	public void tolead() {
		clickByXpath(prop.getProperty("MergeLead.tolead.Xpath"));
		//switchToLastWindow();
		//clickByXpath(prop.getProperty(("MergeLead.secondlead.Xpath")));
		//switchToParentWindow();
	}
	
	public void clickMergeButton(){
		clickByLink(prop.getProperty("Merge"));
}

}