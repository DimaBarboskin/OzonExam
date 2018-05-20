package steps;

import io.qameta.allure.Step;
import pages.BasketPage;

/**
 * Created by Rogoza Dimity on 19.05.2018.
 */
public class BasketPageSteps {

    @Step("Чистим корзину")
    public void clickDeleteAll(){
        new BasketPage().clickDeleteAll();
    }

    @Step("Проверяем заголовок")
    public void checkTitle(String title){
        new BasketPage().checkTitle(title);
    }
}
