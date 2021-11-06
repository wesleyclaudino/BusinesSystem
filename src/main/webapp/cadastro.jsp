<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
  <html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="imagex/png" href="bcs_logo_transparent.png">
    <title> Página de Cadastro </title>
    
	<style>
	body{
		display: flex
		align-items: center;
		background-color: #f5f5f5;
	}
	</style>
    
  </head>

  <body>

    <div class="container">
      <main>
        <div class="py-5 text-center">
          
          <h2> Formulário de Cadastro </h2>

        </div>

        <div class="col-md-7 col-lg-8">
          <form class="needs-validation" method="get" action="cadastrar">
            <div class="row g-3">
              <div class="col-sm-6">
                <label for="nomeDaEmpresa" class="form-label"> Nome da Empresa </label>
                <input type="text" class="form-control" name="nomeDaEmpresa" id="nomeDaEmpresa" placeholder="Business Systems" required>
                <div class="invalid-feedback">
                  É necessário um nome válido.
                </div>
              </div>

              <div class="col-12">
                <label for="nomeDeUsuario" class="form-label"> Nome de usuário </label>
                <div class="input-group has-validation">
                  <span class="input-group-text">@</span>
                  <input type="text" class="form-control" name="nomeDeUsuario" id="nomeDeUsuario" placeholder="businesystems" required>
                  <div class="invalid-feedback">
                    É necessário um nome de usuário.
                  </div>
                </div>
              </div>

              <div class="col-12">
                <label for="email" class="form-label"> Email </label>
                <input type="email" class="form-control" name="email" id="email" placeholder="name@example.com" required>
                <div class="invalid-feedback">
                  Por favor, insira um endereço de e-mail válido.
                </div>
              </div>
              
              <div class="col-12">
                <label for="senha" class="form-label"> Senha </label>
                <input type="password" class="form-control" name="senha" id="senha" placeholder="********" required>
                <div class="invalid-feedback">
                  Por favor, insira um endereço de e-mail válido.
                </div>
              </div>

              <div class="col-12">
                <label for="endDaEmpresa" class="form-label"> Endereço da empresa </label>
                <input type="text" class="form-control" name="endDaEmpresa" id="endDaEmpresa" placeholder="Logradouro/Complemento  Bairro  Cidade">
                <div class="invalid-feedback">
                  Por favor, insira um endereço.
                </div>
              </div>

              <div class="col-12">
                <label for="cep" class="form-label"> CEP </label>
                <input type="text" class="form-control" name="cep" id="cep" placeholder="XXXXX-XXX" required>
                <div class="invalid-feedback">
                  Por favor, insira um CEP válido.
                </div>
              </div>

              <div class="col-12">
                <label for="cnpj" class="form-label"> CNPJ </label>
                <input type="text" class="form-control" name="cnpj" id="cnpj" placeholder="XX.XXX.XXX/0001-XX" required>
                <div class="invalid-feedback">
                  Por favor, insira um CNPJ válido.
                </div>
              </div>

              <div class="col-md-5">
                <label for="pais" class="form-label"> País da sede </label>
                <select class="form-select" name="pais" id="pais" required>
                  <option value=null> Escolha... </option>
                  <option value="Estados Unidos">Estados Unidos</option>
                  <option value="Brasil">Brasil</option>
                  <option value="Inglaterra">Inglaterra</option>
                  <option value="Canadá">Canadá</option>
                </select>
                <div class="invalid-feedback">
                  Por favor, selecione um país.
                </div>
              </div>

              <div class="col-md-4">
                <label for="estado" class="form-label"> Estado </label>
                <select class="form-select" name="estado" id="estado" required>
                  <option value=null> Escolha... </option>
                  <option value="sp"> São Paulo </option>
                  <option value="mg"> Minas Gerais </option>
                  <option value="mt"> Mato Grosso do Sul </option>
                  <option value="df"> Distrito Federal </option>
                </select>
                <div class="invalid-feedback">
                  Por favor, selecione um estado.
                </div>
              </div>
            </div>

            <hr class="my-4">

            <button class="w-100 btn btn-primary btn-lg" type="submit"> Cadastrar </button>
          </form>
        </div>
      </div>
    </main>


    <footer class="my-5 pt-5 text-muted text-center text-small">
      <p class="mb-1">&copy; 2021 Business Systems</p>
      <ul class="list-inline">
        <li class="list-inline-item"><a href="#">Privacidade</a></li>
        <li class="list-inline-item"><a href="#">Termos</a></li>
        <li class="list-inline-item"><a href="#">Suporte</a></li>
      </ul>
    </footer>

  </div>

  <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
  <script src="form-validation.js"></script>
</body>
</html>