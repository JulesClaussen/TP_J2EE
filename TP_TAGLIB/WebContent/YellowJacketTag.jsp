<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TP Taglibs</title>
<%@ taglib uri="tagliblanguage" prefix="lang"%>
</head>
<body>

	<h1>Tag Libs</h1>
		
	<form action='http://localhost:8080/TP_TAGLIB/TagLibMultiLanguageYellowJacket'
		method='post'>
	
		<select name='country'>
			<option value="France">	<lang:lang language='<%=request.getParameter("language")%>' key='France' /></option>
			<option value="Allemagne"> <lang:lang language='<%=request.getParameter("language")%>' key='Allemagne' /></option>
			<option value="Pologne"> <lang:lang language='<%=request.getParameter("language")%>' key='Pologne' /></option>
		</select> 
		
		<select name='language'>
			<option value='Francais'>Francais</option>
			<option value='English'>English</option>
		</select> <input type='submit' value='Submit'/>
	</form>
	
	<img src=/TP_TAGLIB/YellowJacketGraph?country=<%=request.getParameter("country")%> >

</body>
</html>