<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="../jsp/taglib.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Deck Page</title>
</head>
<body>
	<h1>Welcome to Create Deck JSP</h1> 
	
	<table>
		<tr>
			<td>
				<select>
					<c:forEach items="${hsclass}" var="hsclass">
						<option value="${hsclass.classCode}">${hsclass.classDescription}</option>
					</c:forEach>
				</select>
			<td>
		</tr>
	</table>
</body>
</html>