<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AppRoupas</title>
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
	<main class="container mt-5 d-flex flex-column align-items-center">
		<form action="/usuario" method="get" class="w-50" >
			<h2>LISTA DE USUÁRIOS</h2>
			
			<table class="table table-striped">
				<thead>
					<th>Nome</th>
					<th>Sobrenome</th>
					<th>E-mail</th>
					<th>Senha</th>
					<th>Telefone</th>
					<th>Tipo</th>
				</thead>
				<tbody>
				    <tr>
				      <td>Alan</td>
				      <td>dos Santos</td>
				      <td>eu@webmail.com</td>
				      <td>123456</td>
				      <td>1499999999</td>
				      <td>Administrador</td>
				    </tr>
				    <tr>
				      <td>Alan</td>
				      <td>dos Santos</td>
				      <td>eu@webmail.com</td>
				      <td>123456</td>
				      <td>1499999999</td>
				      <td>Administrador</td>
				    </tr>
				    <tr>
				      <td>Alan</td>
				      <td>dos Santos</td>
				      <td>eu@webmail.com</td>
				      <td>123456</td>
				      <td>1499999999</td>
				      <td>Administrador</td>
				    </tr>
				 </tbody>
			</table>
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>
	</main>
</body>
</html>