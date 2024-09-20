package com.test.steps;

import com.test.screen.ScreenHome;
import com.test.screen.ScreenLogin;
import com.test.screen.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();

    ScreenHome home = new ScreenHome();

    @Dado("^que estou na página de login$")
    public void que_estou_na_página_de_login() throws InterruptedException {
        login.botaoLogin.isDisplayed();
    }

    @Quando("^eu preencher meu email e senha corretamente$")
    public void eu_preencher_meu_email_e_senha_corretamente(){
        login.campoEmail.sendKeys("teste@teste.com");
        login.campoSenha.sendKeys("123456");
    }

    @Quando("^clicar em entrar$")
    public void clicar_entrar(){
        login.botaoLogin.click();
    }

    @Então("^devo ser redirecionado para home$")
    public void direcionar_home(){
        home.selecionarEndereco.isDisplayed();
    }

    @Dado("^que eu realize login com sucesso$")
    public void logarComSucesso() throws InterruptedException {
        login.campoEmail.sendKeys("teste@teste.com");
        login.campoSenha.sendKeys("123456");
        login.botaoLogin.click();
        home.selecionarEndereco.isDisplayed();
    }

}
