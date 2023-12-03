package tests.practice_babayigit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QaSmartCardLinkPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QaSmardCardLink {

    QaSmartCardLinkPage qaSmartCardLinkPage=new QaSmartCardLinkPage();
    @Test
    public void US001SayfaGirisDogrulama(){

        Driver.getDriver().get(ConfigReader.getProperty("qaSmardCardUrl"));
        // url'in amazon icerdigini test edelim
        String expectedIcerik = "smart";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        ReusableMethods.bekle(2);

        

    }
    @Test
    public void US002HomeHeaderKontrol(){
        String expectedHeader1 = "Home";
        String actualHeader1  = qaSmartCardLinkPage.headerHome.getText();

        String expectedHeader2="Features";
        String actualHeader2=qaSmartCardLinkPage.headerFeatures.getText();

        String expectedHeader3="About";
        String actualHeader3=qaSmartCardLinkPage.headerAbout.getText();

        String expectedHeader4="Pricing";
        String actualHeader4=qaSmartCardLinkPage.headerPricing.getText();

        String expectedHeader5="Contact";
        String actualHeader5=qaSmartCardLinkPage.headerContact.getText();


        Assert.assertEquals(actualHeader1,expectedHeader1);
        Assert.assertEquals(actualHeader2,expectedHeader2);
        Assert.assertEquals(actualHeader3,expectedHeader3);
        Assert.assertEquals(actualHeader4,expectedHeader4);
        Assert.assertEquals(actualHeader5,expectedHeader5);

        Driver.closeDriver();


    }
}
