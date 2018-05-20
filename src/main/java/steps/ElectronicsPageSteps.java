package steps;

import io.qameta.allure.Step;
import pages.ElectronicsPage;

/**
 * Created by Rogoza Dimity on 19.05.2018.
 */
public class ElectronicsPageSteps {

    @Step("Выбираем устройства")
    public void clickDevice(String device){
        new ElectronicsPage().clickDevice(device);
    }
}
