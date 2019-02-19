<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<p>Select your yellow jacket country</p>
	<p><%=request.getParameter("country")%> : <%=request.getParameter("nb")%></p>
	<form action='/HelloWorldJSP/JSPYellowJacket' method='post'>
		<select name='country'>
			<option value='France'>France</option>
			<option value='Allemagne'>Allemagne</option>
			<option value='Pologne'>Pologne</option>
		<input type=submit name=buttonDisplay value="Submit">
	</form>
	<img src="/HelloWorldJSP/GraphicYellowJacket?country=<%=request.getParameter("country")%>">
</body>
</html>