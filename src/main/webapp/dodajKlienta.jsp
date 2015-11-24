<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dodaj Klienta</title>
</head>
 <style rel="stylesheet" type="text/css">
	body {     background: url('silownia1.jpg');}

 </style>
<body>
	<jsp:useBean id="klient" class="main.java.com.dkasztelan.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="manager" class="main.java.com.dkasztelan.service.KlientManager"
		scope="application" />
			<%
		manager.dodajKlienta(klient);
	%>
	<div class="dodaj">
	<p>Następująca osoba została dodana do bazy:</p>
	


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

	
	 <a class = "link" href="index.jsp">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	


 
  
	</div>
</body>
</html>
