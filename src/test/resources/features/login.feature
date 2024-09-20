#language: pt

  @login
  Funcionalidade: Login no sistema
    Como um usuário registrado
    Eu quero acessar minha conta

    @login-sucesso
    Cenario: Login bem-sucedido
      Dado que estou na página de login
      Quando eu preencher meu email e senha corretamente
      E clicar em entrar
      Então devo ser redirecionado para home


    @login-sucesso-2
    Cenario: Login bem-sucedido com usuário e senha
      Dado que eu realize login com sucesso