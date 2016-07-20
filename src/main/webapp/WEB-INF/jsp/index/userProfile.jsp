
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vote no restaurante</title>
</head>
<body>
<link type="text/css" rel="stylesheet" href="/css/home.css">
<h2 class=" votes-title">Escolha seu favorito entre estes dois: </h2>
	<form method="post" action="/saveUser" class="vote-form">
		<input type="hidden" name="current" value="${handler.getCurrentVoted().getId()}" >
		<label>
			<p>Nome:</p>
			<input class="user-text" type="text" name="nome"> 
		</label>
		<label>
			<p>Email:</p>
			<input class="user-text" type="text" name="email">
		</label>
		<span class="vote-submit">
			<input type="submit"  value="Votar!" >
		</span>
	</form>
</body>
</html>