#language: pt

@pedido
Funcionalidade: Realizar Pedido no App

  @pedido-sucesso
  Cenario: Pedido com sucesso
    Dado que eu realize login com sucesso
    E eu adicione um produto no carrinho
    Quando eu preencher as informações do pedido
    Então devo ser redirecionado para a tela de confirmar pedido