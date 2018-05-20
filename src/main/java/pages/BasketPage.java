package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by Rogoza Dimity on 18.05.2018.
 */
public class BasketPage extends BasePage{
    @FindBy(xpath = "//*[@class = 'bIconButton mRemove mGray jsRemoveAll']")
    WebElement deleteAll;

    @FindBy(xpath = "//*[@class = 'jsInnerContentpage_title']")
    WebElement basketTitle;

    public BasketPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickDeleteAll(){
        WebElement data = BaseSteps.getDriver().findElement(By.xpath("//*[@class = 'eCartControls_infoDate']"));
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(data));
        Wait<WebDriver> wait1 = new WebDriverWait(BaseSteps.getDriver(), 20);
        wait1.until(ExpectedConditions.elementToBeClickable(deleteAll));
        new Actions(BaseSteps.getDriver()).moveToElement(deleteAll).click().perform();

    }

    public void checkTitle(String title){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 30);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class = 'jsInnerContentpage_title']"),title));
        Assert.assertEquals("Не совпадает текст",title,basketTitle.getText());
    }
}
