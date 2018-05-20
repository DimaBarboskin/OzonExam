package steps;

import io.qameta.allure.Step;
import pages.MainPage;

/**
 * Created by Rogoza Dimity on 19.05.2018.
 */
public class MainPageSteps {

    @Step("Закрываем баннер")
    public void closeBanner(){
        new MainPage().closeBanner();
    }

    @Step("Выбираем раздел на главной странице")
    public void clickElementMainPanel(String element){
        new MainPage().clickElementMainPanel(element);
    }
}
