package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenRestaurante extends BaseScreen {

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"add-item-buttom\"])[1]/android.widget.ImageView")
    public RemoteWebElement addItem;

    @AndroidFindBy(accessibility = "open-cart-button")
    public RemoteWebElement IrAoCarrinho;
}
