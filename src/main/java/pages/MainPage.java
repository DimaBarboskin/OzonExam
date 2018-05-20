package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

/**
 * Created by Rogoza Dimity on 18.05.2018.
 */
public class MainPage extends BasePage{
    @FindBy(xpath = "//*[@class ='close-icon eDYbanner_close jsCloseBanner']")
    WebElement closeBanner;

    @FindBy(xpath = "//*[@class = 'eHeaderCategoryLinks_Link bTextLink']")
    List<WebElement> mainPanel;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void closeBanner(){
        closeBanner.click();
    }

    public void clickElementMainPanel(String element){
        selectItem(mainPanel,element).click();
    }
}
