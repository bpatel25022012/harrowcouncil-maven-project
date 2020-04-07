package uk.harrow.gov.pages;

import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

/*
Created By Bhavesh

*/
public class BinCollection extends Utility {

    By welcomeText = By.xpath("//h1[@class='page-heading']");

    public String binCollectionText(){

        return getTextFromElement(welcomeText);
    }

}
