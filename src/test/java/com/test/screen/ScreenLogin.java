package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen{

    @AndroidFindBy(accessibility = "email")
    public RemoteWebElement campoEmail;

    @AndroidFindBy(accessibility = "password")
    public RemoteWebElement campoSenha;

    @AndroidFindBy(accessibility = "login-button")
    public RemoteWebElement botaoLogin;

}
