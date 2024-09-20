package com.test.steps;

import com.test.screen.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PedidoSteps {

    ScreenHome home = new ScreenHome();
    ScreenRestaurante restaurante = new ScreenRestaurante();
    ScreenCarrinho carrinho = new ScreenCarrinho();
    Utils utils = new Utils();
    ScreenPagamento pagamento = new ScreenPagamento();
    ScreenPedido pedido = new ScreenPedido();


    @Dado("^eu adicione um produto no carrinho$")
    public void eu_adicione_um_produto_no_carrinho(){
        home.selecionarEndereco.click();
        home.popupPermitir.click();
        home.restaurante.click();
        restaurante.addItem.click();
        restaurante.IrAoCarrinho.click();
    }

    @Quando("^eu preencher as informações do pedido$")
    public void eu_clicar_em_confirmar_pedido() {
        carrinho.botaoAcessarPagamento.click();
        utils.scrollToTextAndroid("Dinheiro");
        pagamento.elementoDinheiro.click();
        pagamento.botaoFazerPedido.click();
    }

    @Então("^devo ser redirecionado para a tela de confirmar pedido$")
    public void devo_ser_redirecionado_para_a_tela_de_confirmar_pedido(){
        pedido.txtPedidoRealizado.isDisplayed();
    }

}
