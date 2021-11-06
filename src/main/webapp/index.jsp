<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="imagex/png" href="bcs_logo_transparent.png">
    <title>Página Inicial</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    
    <link href="signin.css" rel="stylesheet">
  </head>
  <body class="text-center">
    
<main class="form-signin">
  <form action="logar" method="get">
    <img class="mb-4" src="bcs_logo_transparent.png" width="175" height="175">
    <h1 class="h3 mb-3 fw-normal">Logue-se</h1>

    <div class="form-floating">
      <input type="email" name="email" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Email de acesso</label>
    </div>
    <div class="form-floating">
      <input type="password" name="senha" class="form-control" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">Senha</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Lembrar-me
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit"> Entrar</button>
    
    <a href="cadastro.jsp"> Cadastre-se </a>
    
    <p class="mt-5 mb-3 text-muted">&copy; 2021 Business Systems </p>
  </form>
</main>

 </body>
</html>