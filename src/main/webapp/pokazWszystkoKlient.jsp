<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="main.java.com.dkasztelan.domain.Klient"%>
        <%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Klient</title>

</head>

 <style rel="stylesheet" type="text/css">
 body {    background-color: white; }
 a { color: black ; font-weight: bold; text-align: center;}
 p{margin-left: 15cm; }
 </style>
 
 
<body>
	<jsp:useBean id="klientmanager" class="main.java.com.dkasztelan.service.KlientManager"
		scope="application" />

<div class="row">

<table style="width:80% " border="1";>
    <tr>
    	<th>Id_klient</th>
    	<th>Imie</th>
        <th>Nazwisko</th>
        <th>Telefon</th>
        <th>Cena</th>

    </tr>
 
	 <p:forEach var="klient" items="${klientmanager.pobierzKlientow()}" varStatus="no">

	    <tr>
	     <td> ${klient.id_klient} </td>
            <td> ${klient.imie} </td>
            <td> ${klient.nazwisko} </td>
             <td> ${klient.telefon} </td>
             <td> ${klient.id_karnet} </td>
             <td><form action="deleteKarnet">
      <input type='hidden' name='delete' value= ${karnet.id_karnet} />  
      <input type='submit' value="USUN" />
    </form>
          <form action="edytujKarnet.jsp">
      <input type='hidden' name='update'  value= ${karnet.id_karnet} />
      <input type='submit' value="EDYTUJ" />
    </form></td>
        </tr>
        </p:forEach>
            
            </div>
   
  <a class="btn btn-default" href="pobierzDaneKarnetu.jsp"><b><font color="black">Dodaj karnet</a></h2> &nbsp; &nbsp; &nbsp; &nbsp; <br><br><br>
    <a class="btn btn-default" href="index.jsp"><b><font color="red">Powrót do strony glównej</a></h2> <br><br>
   
</body>
</html>
