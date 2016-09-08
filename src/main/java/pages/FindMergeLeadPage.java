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
public FindMergeLeadPage moveToLastWindow()
{
	switchToLastWindow();
	return this;
	
}
public MergeLeadPage clickfromLead(String fromname) throws InterruptedException
{
	enterByName(prop.getProperty("FindMergeLead.Firstname.Name"), fromname);
	clickByXpath(prop.getProperty("FindMergeLead.FindLeadButton.Xpath"));
	switchToLastWindow();
	return new MergeLeadPage(driver,test);
}

public MergeLeadPage clicktoLead(String toname) throws InterruptedException
{
	enterByName(prop.getProperty("FindMergeLead.Firstname.Name"), toname);
	clickByXpath(prop.getProperty("FindMergeLead.FindLeadButton.Xpath"));
	switchToLastWindow();
	return new MergeLeadPage(driver,test);
}













}
