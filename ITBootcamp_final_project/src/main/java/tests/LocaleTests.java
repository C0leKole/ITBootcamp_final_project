package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends BasicTest {

    @Test(priority = 10)
    public void setLocaleToES() {
        navPage.getLanguageButton().click();
        navPage.getESbutton().click();
        String headerText = navPage.getHeaderFromChangedLanguage().getText();
        Assert.assertTrue(headerText.contains("de aterrizaje"), "Page header doesn't contain 'de aterrizaje'");
    }

    @Test(priority = 20)
    public void setLocaleToEN() {
        navPage.getLanguageButton().click();
        navPage.getENbutton().click();
        String headerText = navPage.getHeaderFromChangedLanguage().getText();
        Assert.assertTrue(headerText.contains("Landing"), "Page header doesn't contain 'Landing'");
    }

    @Test(priority = 30)
    public void setLocaleToCN() {
        navPage.getLanguageButton().click();
        navPage.getCNbutton().click();
        String headerText = navPage.getHeaderFromChangedLanguage().getText();
        Assert.assertTrue(headerText.contains("首页"), "Page header doesn't contain '首页'");
    }

    @Test(priority = 40)
    public void setLocaleToFR() {
        navPage.getLanguageButton().click();
        navPage.getFRbutton().click();
        String headerText = navPage.getHeaderFromChangedLanguage().getText();
        Assert.assertTrue(headerText.contains("d'atterrissage"), "Page header doesn't contain 'd'atterrissage'");
    }


}
