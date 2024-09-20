package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenPagamento extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dinheiro']")
    public RemoteWebElement elementoDinheiro;

    @AndroidFindBy(accessibility = "do-order-button")
    public RemoteWebElement botaoFazerPedido;
}
