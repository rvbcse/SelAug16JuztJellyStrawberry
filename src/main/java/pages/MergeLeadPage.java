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

	public FindMergeLeadPage moveLastWindow() throws InterruptedException{
		switchToLastWindow();
		return new FindMergeLeadPage(driver, test);
		}
	public void fromlead() {
		clickByXpath(prop.getProperty("MergeLead.fromlead.Xpath"));

	}
	
	public void tolead() {
		clickByXpath(prop.getProperty("MergeLead.tolead.Xpath"));
	}
	
	public void clickMergeButton(){
		clickByLink(prop.getProperty("Merge"));
}

}