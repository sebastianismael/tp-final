<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	</head>
	<body>
		<form action="recibir" method="post">
			<label>Mensaje que desea enviar:</label>
			<textarea rows="" name="mensaje" cols=""></textarea>
			<input type="submit" value="Enviar Mensaje"/>
		
		</form>
	</body>
</html>