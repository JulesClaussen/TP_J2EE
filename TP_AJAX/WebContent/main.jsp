<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="org.mines.douai.tpj2ee.ajax.YellowJacketAJAXServlet" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax call</title>
</head>
<body>
<f:view>

<div id="quote">
<hr>
<p>Voici le nombre de gilets jaunes</p>
<hr/>
</div>
<select name='country'>
			<option value="France"> France </option>
			<option value="Allemagne"> Allemagne </option>
			<option value="Pologne"> Pologne</option>
</select> 

<input type="submit" id="replaceContent" value="Refresh local"></input>

<script type="text/Javascript">
		$(document).ready(function() {
			$("#replaceContent").click(function() {
				var country = $("#country").val();
				$.getJSON("YellowJacketAJAX?country=" + country, function(data) {
					console.log(data);
					$("#quote p").html("<p>" + amountYellowVest + "</p>");
				});
			});
		});
</script>


</f:view>
</body>
</html>