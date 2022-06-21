package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessagePopUpPage {
    private WebDriver driver;

    public MessagePopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userDoesntExistPopUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(
                        By.xpath("//div[contains(@class, 'v-snack__content')]")));
    }

    public WebElement getTextFromPopUp() {
        return driver.findElement(
                By.xpath("//div[contains(@class, 'v-snack__content')]/ul/li"));
    }

    public WebElement getCloseButton() {
        return driver.findElement(
                By.xpath("//button[contains(@class, 'btnClose v-btn v-btn--flat v-btn--text theme--light" +
                        " v-size--default primary--text')]"));
    }

    public void waitVerifyPopUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(text(), ' IMPORTANT: Verify your account ')]")));
    }

    public String getVerifyYourAccountPopUpText() {
        String textFromPopUp = driver.findElement(
                By.xpath("//div[contains(text(), ' IMPORTANT: Verify your account ')]")).getText();
        return textFromPopUp;
    }

    public void waitDeletedSuccefullyPopUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'v-snack__wrapper v-sheet theme--dark success')]")));
    }
    public String getVerifyAccountExistsPopUpText() {
        String textFromPopUp = driver.findElement(
                By.xpath("//li[contains(text(), 'User does not exists')]")).getText();
        return textFromPopUp;

    }
    public void waitWrongPasswordPopUp () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(text(), 'Wrong password')]")));

    }
    public String getWrongPasswordPopUpText() {
        String textFromPopUp = driver.findElement(
                By.xpath("//li[contains(text(), 'Wrong password')]")).getText();
        return textFromPopUp;

    }


}
