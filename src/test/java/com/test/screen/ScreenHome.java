package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenHome extends BaseScreen{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Selecione seu endereço...']")
    public RemoteWebElement selecionarEndereco;

    @AndroidFindBy(id = "android:id/button1")
    public RemoteWebElement popupPermitir;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store-list-item\"])[1]")
    public RemoteWebElement restaurante;
}
