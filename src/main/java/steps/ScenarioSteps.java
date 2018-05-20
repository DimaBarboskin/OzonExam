package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Rogoza Dimity on 19.05.2018.
 */
public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();

    ElectronicsPageSteps electronicsPageSteps = new ElectronicsPageSteps();

    DevicePageSteps devicePageSteps = new DevicePageSteps();

    BasketPageSteps basketPageSteps = new BasketPageSteps();

    @When("закрыт баннер")
    public void closeBanner(){
        mainPageSteps.closeBanner();
    }

    @When("выбран тип устройства \"(.+)\"$")
    public void clickElementMainPanel(String element){
        mainPageSteps.clickElementMainPanel(element);
    }

    @When("выбрано устройства \"(.+)\"$")
    public void clickDevice(String device){
        electronicsPageSteps.clickDevice(device);
    }

    @When("выбраны бренды \"(.*)\"$")
    public void clickBrendDevice(List<String> brends){
        devicePageSteps.clickBrendDevice(brends);
    }

    @Then("заполняется корзина \"(.+)\"$")
    public void fillBasket(String minPrice){
        devicePageSteps.fillBasket(minPrice);
    }

    @When("зашли в корзину")
    public void clickBasket(){
        devicePageSteps.clickBasket();
    }

    @Then("проверили содержимое корзины")
    public void checkBasket(){
        devicePageSteps.checkBasket();
    }

    @When("отчислили корзину корзину")
    public void clickDeleteAll(){
        basketPageSteps.clickDeleteAll();
    }

    @Then("проверили заголовок \"(.+)\"$")
    public void checkTitle(String title){
        basketPageSteps.checkTitle(title);
    }
}
