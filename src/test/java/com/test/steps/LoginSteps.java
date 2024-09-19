package com.test.steps;

import com.test.screen.ScreenLogin;
import com.test.screen.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();

    Utils utils = new Utils();

    @Dado("^que estou na página de login$")
    public void que_estou_na_página_de_login() {

    }

    @Quando("^eu preencher meu email e senha corretamente$")
    public void eu_preencher_meu_email_e_senha_corretamente(){

    }

    @Quando("^clicar em logar$")
    public void clicar_no_botão(){

    }

    @Então("^devo ser redirecionado para home$")
    public void direcionar_home(){

    }

}
