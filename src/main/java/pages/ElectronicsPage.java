package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

/**
 * Created by Rogoza Dimity on 18.05.2018.
 */
public class ElectronicsPage extends BasePage {
    @FindBy(xpath = "//*[@class = 'eLeftMainMenu_ElementsBlock']//child::a")
    List<WebElement> devices;

    public ElectronicsPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickDevice(String device){
        selectItem(devices,device).click();
    }
}
