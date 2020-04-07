package uk.harrow.gov.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.harrow.gov.pages.BinCollection;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.testbase.TestBase;

/*
Created By Bhavesh
*/public class BinCollectionPage extends TestBase {

    HomePage homePage = new HomePage();
    BinCollection binCollection = new BinCollection();

    @Test

    public void userShouldNavigatetoBinCollectionPage(){
    homePage.clickOnBinCollectionLink();
        String expectedText = "Bins, Waste and Recycling";
        String actualText = binCollection.binCollectionText();
        Assert.assertEquals(expectedText, actualText);


    }
}
