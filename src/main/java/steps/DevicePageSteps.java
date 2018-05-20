package steps;

import io.qameta.allure.Step;
import pages.DevicePage;

import java.util.List;

/**
 * Created by Rogoza Dimity on 19.05.2018.
 */
public class DevicePageSteps {

    @Step("Выбираем бренды")
    public void clickBrendDevice(List<String> brends){
        new DevicePage().clickBrendDevice(brends);
    }

    @Step("Выбираем минимальную цену")
    public void fillBasket(String minPrice){
        new DevicePage().fillBasket(minPrice);
    }

    @Step("Заходим в корзину")
    public void clickBasket(){
        new DevicePage().clickBasket();
    }

    @Step("Проверяем товар в корзине")
    public void checkBasket(){
        new DevicePage().checkBasket();
    }
}
