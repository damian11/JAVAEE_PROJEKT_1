<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dodaj Klienta</title>
</head>
 <style rel="stylesheet" type="text/css">
	body {    background-color: ; }
	table {
	border-collapse: collapse;
	width: 300px; 
	    margin-top: 150px;
     margin-left: 600px;}
	td {
	border: 2px solid #000000;
	padding: 5px;}
	.link { color: black ; font-weight: bold; text-align: center;}
	.header {
    font-weight: bold;
    background-color: #C0C0C0; }
    p {  font-weight: bold; color: black;   margin-top: 80px;  margin-left: 500px; font-size: 24px;}
 
 </style>
<body>
	<jsp:useBean id="klient" class="main.java.com.dkasztelan.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="manager" class="main.java.com.dkasztelan.service.KlientManager"
		scope="application" />
			<%
		manager.add(klient);
	%>
	<div class="dodaj">
	<p>Następująca osoba została dodana do bazy:</p>
	

<table>
	<tr class = "header">
		<td> Imię: </td>
		<td> Nazwisko: </td>
		<td> Telefon: </td>
	</tr>
	<tr>
		<td> <jsp:getProperty name="klient" property="imie"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="klient" property="nazwisko"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="klient" property="telefon"></jsp:getProperty> </td>
	</tr>


</table>

	
	 <a class = "link" href="http://localhost:8080/silownia/">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	


 
  
	</div>
</body>
</html>
