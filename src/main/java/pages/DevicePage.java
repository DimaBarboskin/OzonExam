package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rogoza Dimity on 18.05.2018.
 */
public class DevicePage extends BasePage {
    static List<String> nameDevices = new ArrayList<>();

   @FindBy(xpath = "//*[@class = 'eFromToInput_InputField mFrom']")
   WebElement upPrice;

   @FindBy(xpath = "//*[@class='eOneTile_priceWrap']//following-sibling::a//child::div[@itemprop = 'name']")
   List<WebElement> allDevices;

   @FindBy(xpath = "//*[@class='bSaleBlockButton jsButton']")
   WebElement addToBasket;

   @FindBy(xpath = "//*[@class= 'bItemName']")
   WebElement devicesName;

   @FindBy(xpath = "//*[@class = 'eMyOzon_Item_Bottom']")
   WebElement baskect;

   @FindBy(xpath = "//*[@class='eCartItem_nameValue']")
   List<WebElement> inBasket;

    public DevicePage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickBrendDevice(List<String> brends){
        for(String brend : brends)
        BaseSteps.getDriver().findElement(By.xpath("//*[@class = 'eFilterList_OptionLink' and contains(text(),'"+brend+"')]")).click();
    }

    public void fillMinPrice(String minPrice){
        upPrice.clear();
        upPrice.sendKeys(minPrice);
    }

    public void fillBasket(String minPrice){
        for(int i = 0; i<allDevices.size();i++){
            if(i%2==0){
                waiting(upPrice);
                fillMinPrice(minPrice);
                allDevices.get(i).click();
                addToBasket.click();
                nameDevices.add(devicesName.getText());
                BaseSteps.getDriver().navigate().back();
            }
        }
    }

    public void clickBasket(){
        baskect.click();
    }

    public void checkBasket(){
        for(int i = 0; i<inBasket.size();i++){
            for(int j=0; j<nameDevices.size();j++){
                if(nameDevices.get(j).equalsIgnoreCase(inBasket.get(i).getText())){
                    return;
                }
            }
            Assert.fail("Не найден элемент в корзине");
        }
    }
}

