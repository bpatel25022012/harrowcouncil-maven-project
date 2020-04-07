package uk.harrow.gov.pages;

import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

/*
Created By Bhavesh
*/
public class HomePage extends Utility {

    By loginAndRegisterLink = By.xpath("//span[@class='icon-fallback']");
    By binCollectionLink = By.xpath("//span[@class='my-activity__icon icon icon-service--bins_waste_recycling']");


    public void clickOnLoginAndRegisterLink (){

        clickOnElement(loginAndRegisterLink);
    }
    public void clickOnBinCollectionLink (){

        clickOnElement(binCollectionLink);
    }

}

