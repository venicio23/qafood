package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenCarrinho extends BaseScreen {

    //@AndroidFindBy(id
    @AndroidFindBy(accessibility = "confirm-order-button")
    public RemoteWebElement botaoAcessarPagamento;
}
