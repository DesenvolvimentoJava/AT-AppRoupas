<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro de Usuario</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="javascript:void(0)">Logo</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="mynavbar">
	      <ul class="navbar-nav me-auto">
	        <li class="nav-item">
	          <a class="nav-link" href="javascript:void(0)">Link</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="javascript:void(0)">Link</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="javascript:void(0)">Link</a>
	        </li>
	      </ul>
	      <form class="d-flex">
	        <input class="form-control me-2" type="text" placeholder="Search">
	        <button class="btn btn-primary" type="button">Search</button>
	      </form>
	    </div>
	  </div>
	</nav>
	<div class="container mt-5 d-flex flex-column align-items-center border border-2 rounded pt-5 pb-5">
		<h2>Cadastro de Usuário</h2>
		<form action="/usuario/incluir" method="post" class="w-50" >
	    	<input type="text" class="form-control form-control-lg mt-3" placeholder="Nome" name="nome">
	    	<input type="text" class="form-control form-control-lg mt-3" placeholder="Sobrenome" name="sobrenome">
	    	<input type="text" class="form-control form-control-lg mt-3" placeholder="E-mail" name="email">
	    	<input type="password" class="form-control form-control-lg mt-3" placeholder="senha" name="senha">
	    	<input type="text" class="form-control form-control-lg mt-3" placeholder="Telefone" name="tel">
	    	<div class="d-flex justify-content-around">
		    	<div class="form-check form-switch mt-3">
		    		<label class="form-check-label" for="adm">Administrador</label>
	  				<input class="form-check-input" type="radio" id="adm" name="tipo" value="1">
	  			</div>
	  			<div class="form-check form-switch mt-3">
	  				<label class="form-check-label" for="funcionario">Funcionario</label>
	  				<input class="form-check-input" type="radio" id="funcionario" name="tipo" value="2">
	  			</div>
	  			<div class="form-check form-switch mt-3">
	  				<label class="form-check-label" for="cliente">Cliente</label>
	  				<input class="form-check-input" type="radio" id="cliente" name="tipo" value="3">
				</div> 
			</div> 
			<button type="submit" class="btn btn-outline-secondary mt-5">Cadastrar</button>	   	   	
	  	</form>
  	</div>

</body>
</html>