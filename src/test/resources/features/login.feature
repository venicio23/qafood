#language: pt

  @login
  Funcionalidade: Login no sistema
    Como um usuário registrado
    Eu quero acessar minha conta

    @login-sucesso
    Cenario: Login bem-sucedido
      Dado que estou na página de login
      Quando eu preencher meu email e senha corretamente
      E clicar em logar
      Então devo ser redirecionado para home
