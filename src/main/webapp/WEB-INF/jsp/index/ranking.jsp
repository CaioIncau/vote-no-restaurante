<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="/css/ranking.css">

<title>Vote no restaurante</title>
</head>
<body>
<div class="ranking-header">
<p> Obrigado por participar ${user.getName()}
<h2>Ranking</h2>
	<img src="${all.get(0).getLogoUrl()}">
</div>
<div class="ranking">
	<c:forEach var="i" begin="0" end="4">
	 <p> ${all.get(i).getName()} - ${all.get(i).getVotes().size() } votos</p>
	</c:forEach>
</div>
</body>
</html>