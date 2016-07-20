
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vote no restaurante</title>
</head>
<body>
<style>
.vote-form{
display:flex;
margin: 0 auto;
max-width: 900px;
padding: 20px 0;
flex-wrap: wrap;
text-align: center;
}
.vote-submit{
flex-basis:100%;
text-align: center;
}
.vote-submit input{
    padding: 1em 2em;
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    background-color: white;
    border-radius: 5px;
    color: #fff;
    background-color: #337ab7;
    border-color: #2e6da4;
    font-weight: 600;
    margin-top: 50px;
}
label{
    flex: 1;
    border: 1px solid lightgray;
    border-radius: 5px;
    margin: 0 2em;
    padding: 1em;
}
label img{
	max-width: 350px;
	    min-height: 350px;
}
.votes-title{
	width: 100%;
	text-align: center;
	font-size: 2em;
	    text-align: center;
    font-family: "‘Palatino Linotype’", "‘Book Antiqua’", Palatino, serif;
    padding: 1em 0px;
}

</style>
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