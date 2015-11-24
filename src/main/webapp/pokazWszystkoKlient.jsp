<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"  import="main.java.com.dkasztelan.domain.Klient"%>
        <%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Klienci</title>

</head>

 <style rel="stylesheet" type="text/css">
	body{
		background: url('silownia1.jpg'); background-position: center top; no-repeat;
	}
	a{ 
		color: white; 
		font-weight: bold; 
		text-align: center;
	}
 	td{
 		text-align : center;
 		color: white;
 	}
 	th{
 		color: white;
 	}
    p{
    	margin-left: 10cm;
    	color: white;
    }
    table{
    	margin-left: 140px;
    }            
</style>
 
<body>
	<jsp:useBean id="klientmanager" class="main.java.com.dkasztelan.service.KlientManager" scope="application" />

<div class="row">

<table style="width:90% " border="1";>
    <tr>
        <th>Id_klient</th>
    	<th>Imie</th>
        <th>Nazwisko</th>
        <th>Telefon</th>
        <th>Operacje</th>


    </tr>
 
	 <p:forEach var="klient" items="${klientmanager.pobierzKlientow()}" >

	    <tr>
	     <td> ${klient.id_klient} </td>
         <td> ${klient.imie} </td>
         <td> ${klient.nazwisko} </td>
         <td> ${klient.telefon} </td>
      
      <td>
      <form action="deleteKlient">
      <input type='hidden' name='delete' value= ${klient.id_klient} />  
      <input type='submit' value="USUN" />
	  </form>
	  
      <form action="edytujKlient.jsp">
      <input type='hidden' name='update'  value= ${klient.id_klient} />
      <input type='submit' value="EDYTUJ" />
      </form>
      </td>
        </tr>
        </p:forEach>
            
</div>
   
  <a class="btn btn-default" href="pobierzDaneKlienta.jsp"><b><font color="white">Dodaj klienta</a></h2>   &nbsp; &nbsp; <br><br>
    <a class="btn btn-default" href="index.jsp"><b><font color="white">Powrót do strony glównej</a></h2> <br><br>
   
</body>
</html>
