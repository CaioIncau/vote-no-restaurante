<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vote no restaurante</title>
</head>
<body>

<c:forEach var="i" begin="0" end="4">
 <p> ${all.get(i).getName()} - ${all.get(i).getVotes().size() }</p>
</c:forEach>

</body>
</html>