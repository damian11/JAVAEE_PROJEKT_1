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
	table{
	border-collapse: collapse;
	width: 500px; 
	margin-top: auto;

    }
    
   td {
	border: 2px solid #000000;
	padding: 5px;}
	.rama {
    font-weight: bold;
    color: white;
    font-size: 40px;
    }
    p {  font-weight: bold; color: white;   margin-top: 80px;  margin-left: 500px; font-size: 50px;}
 </style>
<body>
	<jsp:useBean id="klient" class="main.java.com.dkasztelan.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="klientmanager" class="main.java.com.dkasztelan.service.KlientManager"
		scope="application" />
			<%
		klientmanager.dodajKlienta(klient);
	%>
	<div class="dodaj">
	<p>Następująca osoba została dodana do bazy:</p>
	
<table>

	<tr class = "rama">
		<td>Imię</td>  

		<td>Nazwisko</td> 

		<td>Telefon</td>
	</tr>
	<tr class = "rama">
		<td> <jsp:getProperty name="klient" property="imie"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="klient" property="nazwisko"></jsp:getProperty> </td>
		<td> <jsp:getProperty name="klient" property="telefon"></jsp:getProperty> </td>
	</tr>


</table>

	
	 <a class = "link" href="index.jsp">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	
 <a class="btn btn-default" href="pobierzDaneKlienta.jsp"><b><font color="white">Dodaj klienta</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

 
  
	</div>
</body>
</html>
