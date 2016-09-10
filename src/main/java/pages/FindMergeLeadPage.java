package pages;
import pages.MergeLeadPage;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.OpentapsWrappers;
public class FindMergeLeadPage extends OpentapsWrappers {

	public FindMergeLeadPage(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver; 
		this.test = test;
	}
public FindMergeLeadPage moveToLastWindow() throws InterruptedException
{
	Thread.sleep(10000);
	switchToLastWindow();
	Thread.sleep(5000);
	return this;
	
}
public FindMergeLeadPage clickLead(String fromname) throws InterruptedException
{
	Thread.sleep(5000);
	enterByName(prop.getProperty("FindMergeLead.Firstname.Name"), fromname);
	Thread.sleep(5000);
	clickByXpath(prop.getProperty("FindMergeLead.FindLeadButton.Xpath"));
	Thread.sleep(5000);
	clickByXpath(prop.getProperty("FindMergeLead.FirstResultingLead.Xpath"));
	return this;
}
public MergeLeadPage moveToParentWindow() throws InterruptedException
{
	Thread.sleep(5000);
	switchToParentWindow();
	return new MergeLeadPage(driver, test);
}



}
