
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vote no restaurante</title>
</head>
<body>
<link type="text/css" rel="stylesheet" href="/css/home.css">
<h2 class=" votes-title">Escolha seu favorito entre estes dois: </h2>
	<form method="post" action="/vote" class="vote-form">
		<input type="hidden" name="current" value="${handler.getCurrentVoted().getId()}" >
		<label>
			<img src="${handler.getCurrentVoted().getLogoUrl()}" />
			<p>${handler.getCurrentVoted().getName()}</p>
			<input type="radio" name="selected" required value="${handler.getCurrentVoted().getId()}" >
		</label>
		<label>
			<img src="${handler.getNext().getLogoUrl()}" />
			<p>${handler.getNext().getName()}</p>
			<input type="radio" name="selected" value="${handler.getNext().getId()}" >
		</label>
		<span class="vote-submit">
			<input type="submit"  value="Votar!" >
		</span>
	</form>
</body>
</html>